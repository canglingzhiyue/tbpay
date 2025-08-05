package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.holder.desc.b;
import com.taobao.android.detail.core.utils.i;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXRenderStrategy;
import com.taobao.weex.d;

/* loaded from: classes5.dex */
public class faw extends b<fbm> implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "WeexViewHolder";
    private WXSDKInstance k;
    private FrameLayout l;
    private Context m;

    static {
        kge.a(-907806023);
        kge.a(-748561575);
    }

    public static /* synthetic */ Object ipc$super(faw fawVar, String str, Object... objArr) {
        if (str.hashCode() == 90991720) {
            super.a();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean c2(fbm fbmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c540d70d", new Object[]{this, fbmVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public /* synthetic */ void a(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64aa4550", new Object[]{this, bVar});
        } else {
            b((fbm) bVar);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ boolean a(fbm fbmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7480be1", new Object[]{this, fbmVar})).booleanValue() : c2(fbmVar);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ View c(fbm fbmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("55e1d761", new Object[]{this, fbmVar}) : a2(fbmVar);
    }

    public faw(Activity activity) {
        super(activity);
        this.m = activity.getApplicationContext();
        this.k = new WXSDKInstance(this.m);
        this.k.a(this);
        this.l = new FrameLayout(this.m);
        emu.a("com.taobao.android.detail.wrapper.ext.component.desc.viewholder.WeexViewHolder");
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(fbm fbmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c7038e89", new Object[]{this, fbmVar});
        }
        this.l.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return this.l;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public void b(fbm fbmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6bdd088", new Object[]{this, fbmVar});
        } else if (TextUtils.isEmpty(fbmVar.f27749a)) {
        } else {
            this.k.c("WeexViewHolder", fbmVar.f27749a, null, JSONObject.toJSONString(fbmVar.b), WXRenderStrategy.APPEND_ASYNC);
        }
    }

    @Override // com.taobao.weex.d
    public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
            return;
        }
        FrameLayout frameLayout = this.l;
        if (frameLayout == null) {
            return;
        }
        frameLayout.addView(view);
    }

    @Override // com.taobao.weex.d
    public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
        } else {
            i.d("WeexViewHolder", String.valueOf(i2));
        }
    }

    @Override // com.taobao.weex.d
    public void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
        } else {
            i.d("WeexViewHolder", String.valueOf(i2));
        }
    }

    @Override // com.taobao.weex.d
    public void onException(WXSDKInstance wXSDKInstance, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str, str2});
            return;
        }
        i.a("WeexViewHolder", str + "\n" + str2);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.m = null;
        this.k.onActivityDestroy();
        super.a();
    }
}
