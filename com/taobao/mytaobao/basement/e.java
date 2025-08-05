package com.taobao.mytaobao.basement;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.view.MTPtrRecyclerView;
import com.taobao.taobao.R;
import tb.kge;
import tb.mub;

/* loaded from: classes7.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final mub f18317a;
    private final RecyclerView.OnScrollListener b;
    private final MTPtrRecyclerView c;

    static {
        kge.a(733711161);
    }

    public static int a(MTPtrRecyclerView mTPtrRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d7e4267", new Object[]{mTPtrRecyclerView})).intValue();
        }
        if (mTPtrRecyclerView.getFlEndViewContainer() == null || mTPtrRecyclerView.getFlEndViewContainer().getChildCount() <= 0) {
            return -1;
        }
        View findViewById = mTPtrRecyclerView.findViewById(R.id.fl_basement);
        if (findViewById == null) {
            return 0;
        }
        int[] iArr = new int[2];
        findViewById.getLocationInWindow(iArr);
        return mTPtrRecyclerView.getHeight() - iArr[1];
    }

    public e(MTPtrRecyclerView mTPtrRecyclerView, MTBBasementContainerView mTBBasementContainerView) {
        this.c = mTPtrRecyclerView;
        this.b = a(mTBBasementContainerView);
        this.c.addOnScrollListener(this.b);
        this.f18317a = new mub(mTPtrRecyclerView, mTBBasementContainerView);
        this.f18317a.c(true);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f18317a.a(z);
        }
    }

    private RecyclerView.OnScrollListener a(MTBBasementContainerView mTBBasementContainerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.OnScrollListener) ipChange.ipc$dispatch("47cdaa8d", new Object[]{this, mTBBasementContainerView}) : new RecyclerView.OnScrollListener() { // from class: com.taobao.mytaobao.basement.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == 806944192) {
                    super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                } else if (hashCode != 2142696127) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                }
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (i != 0) {
                    return;
                }
                e.this.f18317a.c(true);
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                e.this.f18317a.c(false);
            }
        };
    }

    public void a() {
        RecyclerView.OnScrollListener onScrollListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        MTPtrRecyclerView mTPtrRecyclerView = this.c;
        if (mTPtrRecyclerView == null || (onScrollListener = this.b) == null) {
            return;
        }
        mTPtrRecyclerView.removeOnScrollListener(onScrollListener);
    }
}
