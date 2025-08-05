package com.taobao.message.lab.comfrm.util;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.support.model.Function2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class ExecuteLimiter<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<T> bufferData;
    private boolean debug;
    private final Executor<T> mCallback;
    private long mExecuteStartTime;
    private boolean mExecuting;
    private Function2<T, List<T>, List<T>> mMergeFunc;
    private final int mTimeout;

    /* loaded from: classes7.dex */
    public interface Executor<T> {
        void execute(List<T> list, ExecuteLimiter executeLimiter);
    }

    static {
        kge.a(-1168959890);
    }

    public ExecuteLimiter(int i, Function2<T, List<T>, List<T>> function2, Executor<T> executor, boolean z) {
        this.debug = false;
        this.mTimeout = i;
        this.mMergeFunc = function2;
        this.mCallback = executor;
        this.debug = z;
    }

    public void notifyExecuteFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54f58a6", new Object[]{this});
            return;
        }
        synchronized (this) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (this.debug) {
                Logger.e("ExecuteLimiter", "notifyExecuteFinish|" + uptimeMillis);
            }
            this.mExecuting = false;
            if (this.bufferData != null) {
                execute(uptimeMillis);
            }
        }
    }

    public void tryExecute(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19616e5d", new Object[]{this, t});
            return;
        }
        synchronized (this) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (this.bufferData == null) {
                this.bufferData = Collections.singletonList(t);
                if (this.debug) {
                    Logger.e("ExecuteLimiter", "tryExecute|bufferData|" + uptimeMillis);
                }
            } else {
                this.bufferData = this.mMergeFunc.map(t, this.bufferData);
                if (this.debug) {
                    Logger.e("ExecuteLimiter", "tryExecute|mMergeFunc|" + uptimeMillis);
                }
            }
            if (this.mExecuting && uptimeMillis - this.mExecuteStartTime < this.mTimeout) {
                if (this.debug) {
                    Logger.e("ExecuteLimiter", "tryExecute|skip|" + uptimeMillis);
                }
            } else if (this.bufferData != null) {
                execute(uptimeMillis);
            }
        }
    }

    private void execute(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acebecc8", new Object[]{this, new Long(j)});
            return;
        }
        synchronized (this) {
            if (this.debug) {
                Logger.e("ExecuteLimiter", "execute|" + j);
            }
            List<T> list = this.bufferData;
            this.bufferData = null;
            this.mExecuting = true;
            this.mExecuteStartTime = j;
            this.mCallback.execute(list, this);
        }
    }

    /* loaded from: classes7.dex */
    public static class DataListCollectFunction<T> implements Function2<T, List<T>, List<T>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1792235076);
            kge.a(961618626);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.taobao.message.lab.comfrm.support.model.Function2
        public /* bridge */ /* synthetic */ Object map(Object obj, Object obj2) {
            return map((DataListCollectFunction<T>) obj, (List<DataListCollectFunction<T>>) obj2);
        }

        public List<T> map(T t, List<T> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("d6bb4c57", new Object[]{this, t, list});
            }
            ArrayList arrayList = new ArrayList(list);
            arrayList.add(t);
            return arrayList;
        }
    }

    /* loaded from: classes7.dex */
    public static class DataListMergeSplit {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-281799328);
        }

        public static <T> List<List<T>> split(List<T> list, Function2<T, T, Boolean> function2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("6022677a", new Object[]{list, function2});
            }
            ArrayList arrayList = new ArrayList();
            int i = 0;
            int i2 = 0;
            while (i < list.size()) {
                T t = list.get(i);
                T t2 = null;
                i++;
                if (i < list.size()) {
                    t2 = list.get(i);
                }
                if (!(t2 == null ? false : function2.map(t, t2).booleanValue())) {
                    arrayList.add(new ArrayList(list.subList(i2, i)));
                    i2 = i;
                }
            }
            return arrayList;
        }
    }
}
