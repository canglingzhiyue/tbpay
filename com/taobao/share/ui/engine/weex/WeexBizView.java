package com.taobao.share.ui.engine.weex;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.multiapp.ShareBizAdapter;
import java.util.Map;
import tb.kge;
import tb.nyy;
import tb.nzo;

/* loaded from: classes8.dex */
public class WeexBizView extends FrameLayout implements nzo.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Map<String, String> params;
    private static a sListener;
    private nzo.a mInstance;
    private View mView;

    /* loaded from: classes8.dex */
    public interface a {
        void a(WeexBizView weexBizView);

        void a(WeexBizView weexBizView, View view);

        void a(String str, Map<String, String> map);
    }

    /* loaded from: classes8.dex */
    public interface b extends a {
        void a();
    }

    static {
        kge.a(-2037091842);
        kge.a(-75105311);
    }

    public static /* synthetic */ Object ipc$super(WeexBizView weexBizView, String str, Object... objArr) {
        if (str.hashCode() == 949399698) {
            super.onDetachedFromWindow();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public WeexBizView(Context context) {
        super(context);
    }

    public WeexBizView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WeexBizView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void init(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1c8c6f", new Object[]{this, aVar});
        } else {
            init(getContext(), aVar, "");
        }
    }

    public void init(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac371879", new Object[]{this, aVar, str});
        } else {
            init(getContext(), aVar, str);
        }
    }

    public void init(Context context, a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3ea073f", new Object[]{this, context, aVar, str});
            return;
        }
        sListener = aVar;
        nzo shareWeexSdk = ShareBizAdapter.getInstance().getShareWeexSdk(str);
        if (shareWeexSdk == null) {
            return;
        }
        shareWeexSdk.a();
        this.mInstance = shareWeexSdk.a(context, this);
    }

    public void initBackFlow(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cf7bac4", new Object[]{this, aVar, str});
            return;
        }
        sListener = aVar;
        nzo shareBackWeexSdk = ShareBizAdapter.getInstance().getShareBackWeexSdk(str);
        if (shareBackWeexSdk == null) {
            return;
        }
        shareBackWeexSdk.a();
        this.mInstance = shareBackWeexSdk.a(getContext(), this);
    }

    @Override // tb.nzo.b
    public void viewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10e15508", new Object[]{this, view});
        } else {
            this.mView = view;
        }
    }

    public void render(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5abb30fe", new Object[]{this, str, map});
            return;
        }
        nyy.a("调用WeexBizView#render");
        if (StringUtils.isEmpty(str)) {
            nyy.a("【异常】weex url empty");
            sListener.a(this);
            return;
        }
        params = map;
        nzo.a aVar = this.mInstance;
        if (aVar == null) {
            return;
        }
        aVar.a(toString(), str, map, null, getWidth(), getHeight());
    }

    public void render(String str, Map<String, Object> map, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6215748", new Object[]{this, str, map, str2});
            return;
        }
        nyy.a("调用WeexBizView#render");
        if (StringUtils.isEmpty(str)) {
            nyy.a("【异常】weex url empty");
            sListener.a(this);
            return;
        }
        nzo.a aVar = this.mInstance;
        if (aVar == null) {
            return;
        }
        aVar.a(toString(), str, map, str2, getWidth(), getHeight());
    }

    @Override // tb.nzo.b
    public void weexError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7396a5d8", new Object[]{this, str});
            return;
        }
        nzo.a aVar = this.mInstance;
        if (aVar != null) {
            aVar.d();
        }
        setTag(str);
        nyy.a("weexError:" + str);
        sListener.a(this);
    }

    @Override // tb.nzo.b
    public void viewReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b01e385", new Object[]{this});
            return;
        }
        nyy.a("【成功】weexRenderSuccess,当前页面为:" + getContext().getClass().getSimpleName());
        addView(this.mView);
        sListener.a(this, this.mView);
    }

    public static void closeWithParam(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b065e5", new Object[]{str, map});
            return;
        }
        a aVar = sListener;
        if (aVar == null) {
            return;
        }
        aVar.a(str, map);
        sListener = null;
    }

    public static void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[0]);
            return;
        }
        a aVar = sListener;
        if (aVar == null || !(aVar instanceof b)) {
            return;
        }
        ((b) aVar).a();
        sListener = null;
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.mView = null;
        sListener = null;
        nzo.a aVar = this.mInstance;
        if (aVar == null) {
            return;
        }
        aVar.d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        nzo.a aVar = this.mInstance;
        if (aVar == null) {
            return;
        }
        aVar.d();
    }
}
