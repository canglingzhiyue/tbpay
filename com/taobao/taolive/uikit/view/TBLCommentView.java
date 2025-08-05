package com.taobao.taolive.uikit.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import tb.kge;
import tb.pqt;
import tb.prm;
import tb.tfu;

/* loaded from: classes8.dex */
public class TBLCommentView extends FrameLayout implements pqt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static List<Integer> COLOR_RANGE;
    private static Random mRandom;
    private a mAdapter;
    private int mCurrent;
    private RecyclerView mRecyclerView;
    private int mScrollInterval;
    public prm.a mScroller;
    private c mTimer;
    private d mTimerHandlerListener;

    /* loaded from: classes8.dex */
    public static class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public TextView f22036a;
        public TextView b;

        static {
            kge.a(-1590943269);
        }

        public b(View view, int i) {
            super(view);
            this.f22036a = (TextView) view.findViewById(R.id.tbliveuikit_comment_nick);
            this.b = (TextView) view.findViewById(R.id.tbliveuikit_comment_content);
            TextView textView = (TextView) view.findViewById(R.id.tbliveuikit_comment_colon);
            TextView textView2 = this.b;
            if (textView2 != null) {
                textView2.setTextSize(i);
            }
            int color = view.getContext().getResources().getColor(((Integer) TBLCommentView.access$400().get(TBLCommentView.access$500().nextInt(TBLCommentView.access$400().size()))).intValue());
            if (textView != null) {
                textView.setTextSize(i);
                textView.setTextColor(color);
            }
            TextView textView3 = this.f22036a;
            if (textView3 != null) {
                textView3.setTextSize(i);
                this.f22036a.setTextColor(color);
            }
        }
    }

    /* loaded from: classes8.dex */
    public interface d {
        int a();

        void b();
    }

    public static /* synthetic */ Object ipc$super(TBLCommentView tBLCommentView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -270519527:
                super.onFinishTemporaryDetach();
                return null;
            case 348684699:
                super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1861606664:
                super.onStartTemporaryDetach();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ int access$100(TBLCommentView tBLCommentView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("74d841cb", new Object[]{tBLCommentView})).intValue() : tBLCommentView.mCurrent;
    }

    public static /* synthetic */ int access$102(TBLCommentView tBLCommentView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81e1a0dc", new Object[]{tBLCommentView, new Integer(i)})).intValue();
        }
        tBLCommentView.mCurrent = i;
        return i;
    }

    public static /* synthetic */ int access$104(TBLCommentView tBLCommentView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8304b8cf", new Object[]{tBLCommentView})).intValue();
        }
        int i = tBLCommentView.mCurrent + 1;
        tBLCommentView.mCurrent = i;
        return i;
    }

    public static /* synthetic */ a access$200(TBLCommentView tBLCommentView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("1ba50aa0", new Object[]{tBLCommentView}) : tBLCommentView.mAdapter;
    }

    public static /* synthetic */ RecyclerView access$300(TBLCommentView tBLCommentView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("592eb2aa", new Object[]{tBLCommentView}) : tBLCommentView.mRecyclerView;
    }

    public static /* synthetic */ List access$400() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("6ee5f86c", new Object[0]) : COLOR_RANGE;
    }

    public static /* synthetic */ Random access$500() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Random) ipChange.ipc$dispatch("78bcd006", new Object[0]) : mRandom;
    }

    static {
        kge.a(1757548271);
        kge.a(-125540484);
        COLOR_RANGE = new ArrayList();
        mRandom = new Random();
        COLOR_RANGE.add(Integer.valueOf(R.color.tbliveuikit_chat_color1));
        COLOR_RANGE.add(Integer.valueOf(R.color.tbliveuikit_chat_color2));
        COLOR_RANGE.add(Integer.valueOf(R.color.tbliveuikit_chat_color3));
        COLOR_RANGE.add(Integer.valueOf(R.color.tbliveuikit_chat_color4));
    }

    public TBLCommentView(Context context) {
        super(context);
        this.mScrollInterval = 0;
        this.mCurrent = 0;
        this.mTimerHandlerListener = new d() { // from class: com.taobao.taolive.uikit.view.TBLCommentView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.uikit.view.TBLCommentView.d
            public int a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
                }
                return 0;
            }

            @Override // com.taobao.taolive.uikit.view.TBLCommentView.d
            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                TBLCommentView.access$104(TBLCommentView.this);
                if (TBLCommentView.access$200(TBLCommentView.this) == null || TBLCommentView.access$300(TBLCommentView.this) == null || TBLCommentView.this.mScroller == null) {
                    return;
                }
                if (TBLCommentView.access$100(TBLCommentView.this) >= TBLCommentView.access$200(TBLCommentView.this).getItemCount() - 1) {
                    TBLCommentView.access$102(TBLCommentView.this, 0);
                }
                if (TBLCommentView.access$100(TBLCommentView.this) == 0) {
                    TBLCommentView.access$300(TBLCommentView.this).scrollToPosition(TBLCommentView.access$100(TBLCommentView.this));
                } else {
                    prm.a(TBLCommentView.access$300(TBLCommentView.this), TBLCommentView.access$100(TBLCommentView.this), TBLCommentView.this.mScroller);
                }
            }
        };
        init();
    }

    public TBLCommentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mScrollInterval = 0;
        this.mCurrent = 0;
        this.mTimerHandlerListener = new d() { // from class: com.taobao.taolive.uikit.view.TBLCommentView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.uikit.view.TBLCommentView.d
            public int a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
                }
                return 0;
            }

            @Override // com.taobao.taolive.uikit.view.TBLCommentView.d
            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                TBLCommentView.access$104(TBLCommentView.this);
                if (TBLCommentView.access$200(TBLCommentView.this) == null || TBLCommentView.access$300(TBLCommentView.this) == null || TBLCommentView.this.mScroller == null) {
                    return;
                }
                if (TBLCommentView.access$100(TBLCommentView.this) >= TBLCommentView.access$200(TBLCommentView.this).getItemCount() - 1) {
                    TBLCommentView.access$102(TBLCommentView.this, 0);
                }
                if (TBLCommentView.access$100(TBLCommentView.this) == 0) {
                    TBLCommentView.access$300(TBLCommentView.this).scrollToPosition(TBLCommentView.access$100(TBLCommentView.this));
                } else {
                    prm.a(TBLCommentView.access$300(TBLCommentView.this), TBLCommentView.access$100(TBLCommentView.this), TBLCommentView.this.mScroller);
                }
            }
        };
        init();
    }

    public TBLCommentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mScrollInterval = 0;
        this.mCurrent = 0;
        this.mTimerHandlerListener = new d() { // from class: com.taobao.taolive.uikit.view.TBLCommentView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.uikit.view.TBLCommentView.d
            public int a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
                }
                return 0;
            }

            @Override // com.taobao.taolive.uikit.view.TBLCommentView.d
            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                TBLCommentView.access$104(TBLCommentView.this);
                if (TBLCommentView.access$200(TBLCommentView.this) == null || TBLCommentView.access$300(TBLCommentView.this) == null || TBLCommentView.this.mScroller == null) {
                    return;
                }
                if (TBLCommentView.access$100(TBLCommentView.this) >= TBLCommentView.access$200(TBLCommentView.this).getItemCount() - 1) {
                    TBLCommentView.access$102(TBLCommentView.this, 0);
                }
                if (TBLCommentView.access$100(TBLCommentView.this) == 0) {
                    TBLCommentView.access$300(TBLCommentView.this).scrollToPosition(TBLCommentView.access$100(TBLCommentView.this));
                } else {
                    prm.a(TBLCommentView.access$300(TBLCommentView.this), TBLCommentView.access$100(TBLCommentView.this), TBLCommentView.this.mScroller);
                }
            }
        };
        init();
    }

    public void setDataList(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("737e2299", new Object[]{this, jSONArray});
            return;
        }
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.scrollToPosition(0);
        }
        a aVar = this.mAdapter;
        if (aVar == null) {
            return;
        }
        aVar.a(jSONArray);
    }

    public void setTextSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5ef80c", new Object[]{this, new Integer(i)});
            return;
        }
        a aVar = this.mAdapter;
        if (aVar == null) {
            return;
        }
        aVar.a(i);
    }

    public void setTextHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1b4e66", new Object[]{this, new Integer(i)});
            return;
        }
        a aVar = this.mAdapter;
        if (aVar == null) {
            return;
        }
        aVar.b(i);
    }

    public void setScrollInterval(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d322e828", new Object[]{this, new Integer(i)});
            return;
        }
        this.mScrollInterval = i;
        initTimer();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ef5dd08", new Object[]{this});
            return;
        }
        super.onStartTemporaryDetach();
        stopTimer();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe03319", new Object[]{this});
            return;
        }
        super.onFinishTemporaryDetach();
        startTimer();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        startTimer();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        stopTimer();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            startTimer();
        } else {
            stopTimer();
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mRecyclerView = new RecyclerView(getContext());
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        this.mAdapter = new a();
        this.mRecyclerView.setAdapter(this.mAdapter);
        addView(this.mRecyclerView, new FrameLayout.LayoutParams(-1, -1));
        this.mScroller = new prm.a(getContext());
    }

    private void initTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fb3ce1c", new Object[]{this});
        } else if (this.mScrollInterval == 0) {
        } else {
            if (this.mTimer != null) {
                stopTimer();
            }
            this.mTimer = new c(this.mTimerHandlerListener, this.mScrollInterval, Looper.getMainLooper());
            startTimer();
        }
    }

    private void startTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfb8b0a", new Object[]{this});
            return;
        }
        c cVar = this.mTimer;
        if (cVar == null || !cVar.a()) {
            return;
        }
        this.mCurrent = 0;
        this.mTimer.a(this.mTimerHandlerListener);
        this.mTimer.removeCallbacksAndMessages(null);
        this.mTimer.a(0);
        this.mTimer.a(false);
    }

    private void stopTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b325b6a", new Object[]{this});
            return;
        }
        c cVar = this.mTimer;
        if (cVar == null || cVar.a()) {
            return;
        }
        this.mCurrent = 0;
        this.mTimer.removeCallbacksAndMessages(null);
        this.mTimer.a((d) null);
        this.mTimer.a(true);
    }

    @Override // tb.pqt
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else {
            stopTimer();
        }
    }

    @Override // tb.pqt
    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        } else {
            startTimer();
        }
    }

    @Override // tb.pqt
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            stopTimer();
        }
    }

    /* loaded from: classes8.dex */
    public static class a extends RecyclerView.Adapter<b> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private JSONArray f22035a;
        private int b;
        private int c;

        static {
            kge.a(1779910245);
        }

        private a() {
            this.f22035a = new JSONArray();
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public /* synthetic */ void onBindViewHolder(b bVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1071b8aa", new Object[]{this, bVar, new Integer(i)});
            } else {
                a(bVar, i);
            }
        }

        /* JADX WARN: Type inference failed for: r4v5, types: [com.taobao.taolive.uikit.view.TBLCommentView$b, android.support.v7.widget.RecyclerView$ViewHolder] */
        @Override // android.support.v7.widget.RecyclerView.Adapter
        /* renamed from: onCreateViewHolder */
        public /* synthetic */ b mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
        }

        public void a(JSONArray jSONArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
                return;
            }
            this.f22035a.clear();
            if (jSONArray != null) {
                this.f22035a.addAll(jSONArray);
            }
            notifyDataSetChanged();
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                this.b = i;
            }
        }

        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            } else {
                this.c = i;
            }
        }

        public b a(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("9791007c", new Object[]{this, viewGroup, new Integer(i)}) : new b((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tbliveuikit_comment_item, viewGroup, false), this.b);
        }

        public void a(b bVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("87c1239", new Object[]{this, bVar, new Integer(i)});
            } else if (i < 0 || i >= this.f22035a.size()) {
            } else {
                JSONObject jSONObject = this.f22035a.getJSONObject(i);
                if (bVar == null || jSONObject == null) {
                    return;
                }
                if (bVar.f22036a != null) {
                    bVar.f22036a.setText(jSONObject.getString("nick"));
                }
                if (bVar.b == null) {
                    return;
                }
                bVar.b.setText(jSONObject.getString(tfu.COMMENT));
            }
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public int getItemCount() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : this.f22035a.size();
        }
    }

    /* loaded from: classes8.dex */
    public static class c extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private SparseIntArray f22037a;
        private long b;
        private boolean c;
        private WeakReference<d> d;

        static {
            kge.a(-718844934);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public c(d dVar, long j, Looper looper) {
            super(looper);
            this.c = true;
            this.d = new WeakReference<>(dVar);
            this.b = j;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<d> weakReference;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (87208 != message.what || (weakReference = this.d) == null || weakReference.get() == null) {
            } else {
                int a2 = this.d.get().a();
                try {
                    this.d.get().b();
                } catch (Exception e) {
                    TLog.loge("live_uikit.TimerHandler", "handlerMessage exp.", e);
                }
                a(a2);
            }
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                sendEmptyMessageDelayed(87208, b(i));
            }
        }

        private long b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a9d66c2e", new Object[]{this, new Integer(i)})).longValue();
            }
            long j = this.b;
            SparseIntArray sparseIntArray = this.f22037a;
            if (sparseIntArray == null) {
                return j;
            }
            long j2 = sparseIntArray.get(i, -1);
            return j2 > 0 ? j2 : j;
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.c;
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.c = z;
            }
        }

        public void a(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a998ac8", new Object[]{this, dVar});
            } else {
                this.d = new WeakReference<>(dVar);
            }
        }
    }
}
