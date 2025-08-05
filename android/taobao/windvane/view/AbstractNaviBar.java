package android.taobao.windvane.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class AbstractNaviBar extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NAVI_BAR_ID = 110;

    static {
        kge.a(1727045189);
    }

    public abstract void resetState();

    public abstract void startLoading();

    public abstract void stopLoading();

    public AbstractNaviBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AbstractNaviBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbstractNaviBar(Context context) {
        super(context);
    }
}
