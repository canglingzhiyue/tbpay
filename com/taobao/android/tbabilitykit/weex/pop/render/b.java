package com.taobao.android.tbabilitykit.weex.pop.render;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.model.c;
import com.taobao.android.abilitykit.ability.pop.render.ActivityLifeCycleCbRender;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.android.abilitykit.ability.pop.render.PopErrorView;
import com.taobao.taobao.R;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.common.WXErrorCode;
import com.taobao.weex.common.WXRenderStrategy;
import java.util.Map;
import tb.dkt;
import tb.dkv;
import tb.dlr;
import tb.dmr;
import tb.kge;

/* loaded from: classes6.dex */
public class b<PARAMS extends com.taobao.android.abilitykit.ability.pop.model.c, CONTEXT extends dlr> extends ActivityLifeCycleCbRender<PARAMS, CONTEXT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public CONTEXT b;
    private final String c = "TAKWeexPopRender";
    private WXSDKInstance d;
    private c e;

    static {
        kge.a(-882531386);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1795038358) {
            super.a((View) objArr[0]);
            return null;
        } else if (hashCode != 1714797822) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((String) objArr[0], (JSONObject) objArr[1]);
            return null;
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public boolean a(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3afcdd", new Object[]{this, view, new Integer(i)})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ com.taobao.android.abilitykit.ability.pop.model.c a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.abilitykit.ability.pop.model.c) ipChange.ipc$dispatch("c50422cd", new Object[]{bVar}) : bVar.f8938a;
    }

    public static /* synthetic */ c b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("249954e2", new Object[]{bVar}) : bVar.e;
    }

    public static /* synthetic */ WXSDKInstance c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WXSDKInstance) ipChange.ipc$dispatch("23493242", new Object[]{bVar}) : bVar.d;
    }

    public static /* synthetic */ com.taobao.android.abilitykit.ability.pop.model.c d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.abilitykit.ability.pop.model.c) ipChange.ipc$dispatch("d4a5a2a", new Object[]{bVar}) : bVar.f8938a;
    }

    public static /* synthetic */ com.taobao.android.abilitykit.ability.pop.model.c e(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.abilitykit.ability.pop.model.c) ipChange.ipc$dispatch("7ab71749", new Object[]{bVar}) : bVar.f8938a;
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.ActivityLifeCycleCbRender
    public void b(CONTEXT context, PARAMS params, View view, final com.taobao.android.abilitykit.ability.pop.render.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e62ce5b", new Object[]{this, context, params, view, dVar});
            return;
        }
        this.b = context;
        if (this.f8938a == null || TextUtils.isEmpty(this.f8938a.c)) {
            dVar.a(new dkv(10015, "url is empty"), null);
            return;
        }
        final Context a2 = context.a();
        if (a2 == null) {
            dVar.a(new dkv(10015, "context is null"), null);
            return;
        }
        boolean G = dmr.G();
        if (this.d == null) {
            this.d = new WXSDKInstance(a2);
            final dkt e = context.e();
            this.d.a(new com.taobao.weex.d() { // from class: com.taobao.android.tbabilitykit.weex.pop.render.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.weex.d
                public void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
                    }
                }

                @Override // com.taobao.weex.d
                public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
                    }
                }

                @Override // com.taobao.weex.d
                public void onViewCreated(WXSDKInstance wXSDKInstance, View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view2});
                    } else if (view2 != null) {
                        view2.setTag(R.id.tak_pop_ability_engine_tag, e);
                        view2.setClickable(true);
                        dVar.a(view2);
                    } else {
                        dVar.a(new dkv(10000, "weex view create failed"), null);
                    }
                }

                @Override // com.taobao.weex.d
                public void onException(WXSDKInstance wXSDKInstance, String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str, str2});
                    } else if (TextUtils.isEmpty(str)) {
                    } else {
                        if (!str.equals(WXErrorCode.WX_DEGRAD_ERR.getErrorCode()) && !str.equals(WXErrorCode.WX_DEGRAD_ERR_INSTANCE_CREATE_FAILED.getErrorCode()) && !str.equals(WXErrorCode.WX_DEGRAD_ERR_NETWORK_BUNDLE_DOWNLOAD_FAILED.getErrorCode()) && !str.equals(WXErrorCode.WX_DEGRAD_ERR_BUNDLE_CONTENTTYPE_ERROR.getErrorCode()) && !str.equals(WXErrorCode.WX_DEGRAD_ERR_NETWORK_CHECK_CONTENT_LENGTH_FAILED.getErrorCode())) {
                            return;
                        }
                        com.taobao.android.abilitykit.ability.pop.render.d dVar2 = dVar;
                        dVar2.a(new dkv(10000, "weex error:" + str), new PopErrorView(a2, b.a(b.this)));
                    }
                }
            });
            this.e = new c();
            if (!G) {
                this.d.n(this.f8938a.c);
                this.d.a(new WXSDKManager.a() { // from class: com.taobao.android.tbabilitykit.weex.pop.render.b.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.weex.WXSDKManager.a
                    public void onInitSuccess() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("fb2dd3fb", new Object[]{this});
                            return;
                        }
                        b.c(b.this).a(b.b(b.this));
                        b.c(b.this).c("TAKWeexPopRender", b.d(b.this).c, null, null, WXRenderStrategy.APPEND_ASYNC);
                    }

                    @Override // com.taobao.weex.WXSDKManager.a
                    public void a(String str, String str2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                            return;
                        }
                        com.taobao.android.abilitykit.ability.pop.render.d dVar2 = dVar;
                        dVar2.a(new dkv(10000, "weex error:" + str), new PopErrorView(a2, b.e(b.this)));
                    }
                });
            }
        }
        if (!G) {
            return;
        }
        this.d.a(this.e);
        this.d.c("TAKWeexPopRender", this.f8938a.c, null, null, WXRenderStrategy.APPEND_ASYNC);
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void a(int i, int i2) {
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.d == null || this.b == null || this.f8938a == null || i <= 0 || i2 <= 0 || (cVar = this.e) == null) {
        } else {
            cVar.f15369a = new Rect(0, 0, i, i2);
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.ActivityLifeCycleCbRender, com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        super.a(view);
        WXSDKInstance wXSDKInstance = this.d;
        if (wXSDKInstance == null || wXSDKInstance.P_()) {
            return;
        }
        this.d.e();
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.b, com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void a(String str, JSONObject jSONObject) {
        WXSDKInstance wXSDKInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        super.a(str, jSONObject);
        if (IAKPopRender.LifecycleType.ANIMATION_POSITION_CHANGE.equals(str) || (wXSDKInstance = this.d) == null) {
            return;
        }
        wXSDKInstance.a(str, (Map<String, Object>) jSONObject);
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.ActivityLifeCycleCbRender
    public void a(String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17fd7762", new Object[]{this, str, bundle});
        } else if (this.d == null) {
        } else {
            char c = 65535;
            switch (str.hashCode()) {
                case -1930133495:
                    if (str.equals("onCreated")) {
                        c = 0;
                        break;
                    }
                    break;
                case -560905822:
                    if (str.equals("onStarted")) {
                        c = 1;
                        break;
                    }
                    break;
                case -548039954:
                    if (str.equals("onStopped")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1403088877:
                    if (str.equals("onPaused")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1463983852:
                    if (str.equals("onResume")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1955975930:
                    if (str.equals("onDestroyed")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                this.d.onActivityCreate();
            } else if (c == 1) {
                this.d.onActivityStart();
            } else if (c == 2) {
                this.d.onActivityResume();
            } else if (c == 3) {
                this.d.onActivityPause();
            } else if (c == 4) {
                this.d.onActivityStop();
            } else if (c != 5) {
            } else {
                this.d.onActivityDestroy();
            }
        }
    }
}
