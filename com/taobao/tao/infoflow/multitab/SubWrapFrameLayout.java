package com.taobao.tao.infoflow.multitab;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class SubWrapFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MultiSubWrapFrameLayout";
    private final Context mContext;
    private final int mPosition;
    private View mTargetView;

    static {
        kge.a(1348466701);
    }

    public SubWrapFrameLayout(Context context, int i) {
        super(context);
        this.mContext = context;
        this.mPosition = i;
    }

    public void addTabView(i iVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db3fd470", new Object[]{this, iVar, str});
        } else if (this.mTargetView != null) {
        } else {
            g.a(TAG, "SubWrapFrameLayout ->  开始创建视图 调用createView :" + this.mPosition);
            this.mTargetView = iVar.a(this.mPosition, this.mContext, str);
            if (this.mTargetView.getParent() != null && (this.mTargetView.getParent() instanceof ViewGroup)) {
                ((ViewGroup) this.mTargetView.getParent()).removeView(this.mTargetView);
            }
            addView(this.mTargetView, -1, -1);
            iVar.a(this.mPosition, this);
        }
    }

    public boolean isRealView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65b716b8", new Object[]{this})).booleanValue() : getChildCount() > 0;
    }
}
