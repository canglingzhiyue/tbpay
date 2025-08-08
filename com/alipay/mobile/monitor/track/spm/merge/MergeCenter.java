package com.alipay.mobile.monitor.track.spm.merge;

import android.os.AsyncTask;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.logging.api.behavor.Behavor;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.mobile.monitor.track.spm.SpmLogCator;
import com.alipay.mobile.monitor.track.spm.monitor.TrackerExecutor;
import com.alipay.mobile.monitor.track.spm.monitor.tracker.MergeTracker;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@MpaasClassInfo(BundleName = "android-phone-wallet-spmtracker", ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-spmtracker")
/* loaded from: classes3.dex */
public enum MergeCenter {
    INSTANCE;
    
    private static final Object c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final String f5765a = MergeCenter.class.getSimpleName();
    private final PriorityBlockingQueue<Runnable> b = new PriorityBlockingQueue<>();
    private ThreadPoolExecutor h = new ThreadPoolExecutor(1, 1, 3, TimeUnit.SECONDS, this.b);
    private TrackerExecutor g = new TrackerExecutor();
    private Map<String, MergeTask> d = new HashMap();
    private List<String> e = new ArrayList();
    private List<String> f = new ArrayList();

    MergeCenter(String str) {
        this.h.setKeepAliveTime(3000L, TimeUnit.MILLISECONDS);
        this.h.allowCoreThreadTimeOut(true);
    }

    public final void commitImmediately(final String str) {
        SpmLogCator.debug(this.f5765a, "commitImmediately pageId: ".concat(String.valueOf(str)));
        synchronized (c) {
            if (!this.f.contains(str)) {
                this.f.add(str);
            }
        }
        if (!this.e.isEmpty() || !this.d.isEmpty()) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: com.alipay.mobile.monitor.track.spm.merge.MergeCenter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    synchronized (MergeCenter.this) {
                        ArrayList arrayList = new ArrayList();
                        for (String str2 : MergeCenter.this.e) {
                            if (str2.startsWith(str + "__")) {
                                arrayList.add(str2);
                            }
                        }
                        MergeCenter.this.e.removeAll(arrayList);
                        String str3 = MergeCenter.this.f5765a;
                        SpmLogCator.debug(str3, "commitImmediately mMergedKeys.isEmpty: " + MergeCenter.this.e.isEmpty());
                        Iterator it = MergeCenter.this.d.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            if (((String) entry.getKey()).startsWith(str + "__") && entry.getValue() != null) {
                                MergeCenter.this.g.commitTracker(new MergeTracker(((MergeTask) entry.getValue()).getBehavorId(), ((MergeTask) entry.getValue()).getBehavorBuider()));
                                it.remove();
                            }
                        }
                    }
                    String str4 = MergeCenter.this.f5765a;
                    SpmLogCator.debug(str4, "commitImmediately mMergeTasks.isEmpty: " + MergeCenter.this.d.isEmpty());
                }
            });
        }
    }

    public final TrackerExecutor getTrackerExcutor() {
        return this.g;
    }

    public final void merge(MergeTracker mergeTracker) {
        if (mergeTracker == null || mergeTracker.getBehavorBuilder() == null) {
            return;
        }
        if (this.f.contains(mergeTracker.getBehavorBuilder().build().getPageId())) {
            SpmLogCator.debug(this.f5765a, "merge page has been closed. ");
        } else {
            this.h.execute(new MergeDispatcher(mergeTracker));
        }
    }

    @MpaasClassInfo(BundleName = "android-phone-wallet-spmtracker", ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-spmtracker")
    /* loaded from: classes3.dex */
    public class MergeDispatcher implements Comparable, Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private MergeTracker f5766a;

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6a4672d6", new Object[]{this, obj})).intValue();
            }
            return 0;
        }

        public MergeDispatcher(MergeTracker mergeTracker) {
            this.f5766a = mergeTracker;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (this.f5766a == null) {
                    return;
                }
                a(this.f5766a);
            } catch (Exception e) {
                SpmLogCator.error(MergeCenter.this.f5765a, e);
            }
        }

        private void a(MergeTracker mergeTracker) {
            MergeTask merge;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5fe3a69d", new Object[]{this, mergeTracker});
            } else if (mergeTracker == null || mergeTracker.getBehavorBuilder() == null) {
            } else {
                Behavor build = mergeTracker.getBehavorBuilder().build();
                if (StringUtils.isEmpty(build.getSeedID()) || StringUtils.isEmpty(build.getPageId())) {
                    MergeCenter.this.g.commitTracker(mergeTracker);
                    SpmLogCator.debug(MergeCenter.this.f5765a, "execute behavorKey is null. ");
                    return;
                }
                String a2 = a(build);
                if (MergeCenter.this.e.contains(a2)) {
                    SpmLogCator.debug(MergeCenter.this.f5765a, "execute behavorIdentifier has been merged, need not to merge again.behavorIdentifier:".concat(String.valueOf(a2)));
                    return;
                }
                String a3 = a(mergeTracker.getBehavorId(), build);
                MergeTask mergeTask = (MergeTask) MergeCenter.this.d.get(a3);
                if (mergeTask == null) {
                    merge = new MergeTask(mergeTracker);
                } else {
                    merge = mergeTask.merge(mergeTracker);
                }
                synchronized (MergeCenter.this) {
                    MergeCenter.this.e.add(a2);
                    if (a(merge)) {
                        MergeCenter.this.g.commitTracker(new MergeTracker(merge.getBehavorId(), merge.getBehavorBuider()));
                        MergeCenter.this.d.remove(a3);
                    } else {
                        MergeCenter.this.d.put(a3, merge);
                    }
                }
            }
        }

        private boolean a(MergeTask mergeTask) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("92f3f465", new Object[]{this, mergeTask})).booleanValue();
            }
            if (mergeTask.needCommit()) {
                SpmLogCator.debug(MergeCenter.this.f5765a, "checkIfCommit mergeTask needCommit");
                return true;
            }
            Behavor.Builder behavorBuider = mergeTask.getBehavorBuider();
            if (behavorBuider != null) {
                String pageId = behavorBuider.build().getPageId();
                SpmLogCator.debug(MergeCenter.this.f5765a, "checkIfCommit pageId: ".concat(String.valueOf(pageId)));
                synchronized (MergeCenter.c) {
                    boolean contains = MergeCenter.this.f.contains(pageId);
                    if (contains) {
                        boolean a2 = a(pageId);
                        SpmLogCator.debug(MergeCenter.this.f5765a, "checkIfCommit isClosedPage: ".concat(String.valueOf(contains)));
                        SpmLogCator.debug(MergeCenter.this.f5765a, "checkIfCommit isPageEmpty: ".concat(String.valueOf(a2)));
                        if (a2) {
                            MergeCenter.this.f.remove(pageId);
                        }
                        return a2;
                    }
                }
            }
            return false;
        }

        private boolean a(String str) {
            MergeTracker mergeTracker;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
            }
            Iterator it = MergeCenter.this.b.iterator();
            while (it.hasNext()) {
                Runnable runnable = (Runnable) it.next();
                if ((runnable instanceof MergeDispatcher) && (mergeTracker = ((MergeDispatcher) runnable).f5766a) != null && mergeTracker.getBehavorBuilder() != null && str.equals(mergeTracker.getBehavorBuilder().build().getPageId())) {
                    return false;
                }
            }
            return true;
        }

        private static String a(String str, Behavor behavor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e751c937", new Object[]{str, behavor});
            }
            if (behavor == null) {
                return null;
            }
            return behavor.getPageId() + "__" + behavor.getSeedID() + "__" + str;
        }

        private String a(Behavor behavor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6d29d041", new Object[]{this, behavor});
            }
            if (behavor == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder("");
            sb.append(behavor.getPageId());
            sb.append("__");
            sb.append(behavor.getSeedID());
            Map<String, String> a2 = a(behavor.getExtParams());
            if (a2 != null) {
                for (String str : a2.keySet()) {
                    if (!"timeThreshold".equals(str) && !"areaThreshold".equals(str)) {
                        sb.append(str);
                        sb.append(a2.get(str));
                    }
                }
            }
            return sb.toString();
        }

        private Map<String, String> a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{this, map});
            }
            if (map == null) {
                return null;
            }
            TreeMap treeMap = new TreeMap(new Comparator<String>() { // from class: com.alipay.mobile.monitor.track.spm.merge.MergeCenter.MergeDispatcher.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.Comparator
                public int compare(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("2b88f5f3", new Object[]{this, str, str2})).intValue() : str.compareTo(str2);
                }
            });
            treeMap.putAll(map);
            return treeMap;
        }
    }
}
