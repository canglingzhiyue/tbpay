package com.taobao.android.live.plugin.atype.flexalocal.good.dx.view;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.hiq;
import tb.kge;

/* loaded from: classes5.dex */
public class TBLGoodsTimerTextView extends AppCompatTextView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TBLGoodsTimerTextView";
    private final Handler mHandler;
    private a mIOnTimeListener;
    private long mStartTime;
    private final Runnable mTimerTask;

    /* loaded from: classes5.dex */
    public interface a {
        void a();
    }

    static {
        kge.a(-736154966);
    }

    public static /* synthetic */ a access$100(TBLGoodsTimerTextView tBLGoodsTimerTextView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("21a521", new Object[]{tBLGoodsTimerTextView}) : tBLGoodsTimerTextView.mIOnTimeListener;
    }

    public TBLGoodsTimerTextView(Context context) {
        super(context);
        this.mHandler = new Handler();
        this.mTimerTask = new b();
    }

    public TBLGoodsTimerTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mHandler = new Handler();
        this.mTimerTask = new b();
    }

    public TBLGoodsTimerTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHandler = new Handler();
        this.mTimerTask = new b();
    }

    public void startCountDown(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa20c06e", new Object[]{this, new Long(j)});
            return;
        }
        this.mHandler.removeCallbacks(this.mTimerTask);
        this.mStartTime = j;
        long a2 = hiq.a();
        if (a2 <= 0 || a2 > j) {
            return;
        }
        this.mHandler.postDelayed(this.mTimerTask, j - a2);
    }

    public void stopCountDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87d27976", new Object[]{this});
        } else {
            this.mHandler.removeCallbacks(this.mTimerTask);
        }
    }

    public void setIOnTimeListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0b035d6", new Object[]{this, aVar});
        } else {
            this.mIOnTimeListener = aVar;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<TBLGoodsTimerTextView> f13760a;

        static {
            kge.a(-1283199792);
            kge.a(-1390502639);
        }

        private b(TBLGoodsTimerTextView tBLGoodsTimerTextView) {
            this.f13760a = new WeakReference<>(tBLGoodsTimerTextView);
        }

        @Override // java.lang.Runnable
        public void run() {
            a access$100;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f13760a.get() == null || (access$100 = TBLGoodsTimerTextView.access$100(this.f13760a.get())) == null) {
            } else {
                access$100.a();
            }
        }
    }
}
