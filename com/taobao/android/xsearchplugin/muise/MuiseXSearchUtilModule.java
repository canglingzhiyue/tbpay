package com.taobao.android.xsearchplugin.muise;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.android.weex_ability.mtop.MUSMtopModule;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.iml;
import tb.imn;
import tb.imo;
import tb.isr;
import tb.kge;

/* loaded from: classes6.dex */
public class MuiseXSearchUtilModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String METHOD_COMMIT_CLICK = "commitClick";
    public static final String METHOD_COMMIT_EXPOSE = "commitExpose";
    public static final String METHOD_REQUEST_LOST_FOCUS = "requestLostFocus";
    public static final String METHOD_UPDATE_STORAGE = "updateStorage";
    public static final String MODULE_NAME = "xsearchUtil";
    public static boolean REGISTERED;
    public static volatile iml sConstantAdapter;
    private MUSMtopModule mtopDelegate;

    public static /* synthetic */ Object ipc$super(MuiseXSearchUtilModule muiseXSearchUtilModule, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-2094596090);
        REGISTERED = false;
    }

    public static void install(iml imlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c742004a", new Object[]{imlVar});
        } else if (REGISTERED) {
        } else {
            REGISTERED = true;
            sConstantAdapter = imlVar;
            MUSEngine.registerModule("xsearchUtil", MuiseXSearchUtilModule.class);
        }
    }

    public MuiseXSearchUtilModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    @MUSMethod(uiThread = true)
    public void updateStorage(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2b3a517", new Object[]{this, jSONObject});
            return;
        }
        Object tag = getInstance().getTag(SFMuiseSDK.MUISE_EVENT_LISTENER);
        if (!(tag instanceof com.taobao.android.xsearchplugin.weex.weex.h)) {
            return;
        }
        ((com.taobao.android.xsearchplugin.weex.weex.h) tag).b("updateStorage", jSONObject, null, null);
    }

    @MUSMethod(uiThread = true)
    public void requestLostFocus(com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e5d2a63", new Object[]{this, bVar});
            return;
        }
        Object tag = getInstance().getTag(SFMuiseSDK.MUISE_EVENT_LISTENER);
        if (!(tag instanceof com.taobao.android.xsearchplugin.weex.weex.h)) {
            return;
        }
        ((com.taobao.android.xsearchplugin.weex.weex.h) tag).b("requestLostFocus", null, n.a(bVar), null);
    }

    @MUSMethod(uiThread = false)
    public JSONObject getLocalParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b66d71c2", new Object[]{this});
        }
        String e = sConstantAdapter.e();
        String b = sConstantAdapter.b();
        String a2 = sConstantAdapter.a();
        JSONObject jSONObject = new JSONObject();
        if (!StringUtils.isEmpty(e)) {
            jSONObject.put("sversion", (Object) e);
            jSONObject.put("utd_id", (Object) b);
            jSONObject.put("ttid", (Object) a2);
        }
        return jSONObject;
    }

    @MUSMethod
    public void expose(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9705a05", new Object[]{this, jSONObject});
        } else {
            performAction("commitExpose", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void click(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75fe32c1", new Object[]{this, jSONObject});
        } else {
            performAction("commitClick", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void reportChituSE(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("907049c6", new Object[]{this, jSONObject});
            return;
        }
        imn b = imo.b();
        if (b == null) {
            return;
        }
        String string = jSONObject.getString("url");
        if (StringUtils.isEmpty(string) || (jSONObject2 = jSONObject.getJSONObject(InputFrame3.TYPE_RESPONSE)) == null) {
            return;
        }
        String string2 = jSONObject.getString("alias");
        if (StringUtils.isEmpty(string2)) {
            string2 = "xsl";
        }
        b.k().a(string, jSONObject2.toString().getBytes(), string2, true);
        com.taobao.android.searchbaseframe.ace.b.a(imo.b(), string, string2, jSONObject2);
    }

    @MUSMethod(uiThread = false)
    public void send(JSONObject jSONObject, final com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58c78b58", new Object[]{this, jSONObject, bVar});
            return;
        }
        ensureMtopDelegate();
        extractRequestAlias(jSONObject);
        this.mtopDelegate.send(jSONObject.toString(), new com.taobao.android.weex_framework.bridge.b() { // from class: com.taobao.android.xsearchplugin.muise.MuiseXSearchUtilModule.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.bridge.b
            public void a(Object... objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b63135c9", new Object[]{this, objArr});
                } else {
                    bVar.a(objArr);
                }
            }

            @Override // com.taobao.android.weex_framework.bridge.b
            public void b(Object... objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b232c4a8", new Object[]{this, objArr});
                } else {
                    bVar.b(objArr);
                }
            }

            @Override // com.taobao.android.weex_framework.bridge.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    bVar.a();
                }
            }
        });
    }

    @MUSMethod(uiThread = false)
    public void request(JSONObject jSONObject, final com.taobao.android.weex_framework.bridge.b bVar, com.taobao.android.weex_framework.bridge.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ce9e9c8", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        ensureMtopDelegate();
        extractRequestAlias(jSONObject);
        this.mtopDelegate.request(jSONObject, new com.taobao.android.weex_framework.bridge.b() { // from class: com.taobao.android.xsearchplugin.muise.MuiseXSearchUtilModule.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.bridge.b
            public void a(Object... objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b63135c9", new Object[]{this, objArr});
                } else {
                    bVar.a(objArr);
                }
            }

            @Override // com.taobao.android.weex_framework.bridge.b
            public void b(Object... objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b232c4a8", new Object[]{this, objArr});
                } else {
                    bVar.b(objArr);
                }
            }

            @Override // com.taobao.android.weex_framework.bridge.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    bVar.a();
                }
            }
        }, bVar2);
    }

    private void ensureMtopDelegate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7a4f1d2", new Object[]{this});
        } else if (this.mtopDelegate != null) {
        } else {
            this.mtopDelegate = new MUSMtopModule("mtop", (MUSDKInstance) getInstance());
        }
    }

    private String extractRequestAlias(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b21ceb19", new Object[]{this, jSONObject});
        }
        String string = jSONObject.getString("alias");
        return StringUtils.isEmpty(string) ? "muise" : string;
    }

    private void performAction(String str, JSONObject jSONObject, isr.c.a aVar, isr.c.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1840d900", new Object[]{this, str, jSONObject, aVar, aVar2});
            return;
        }
        Object tag = getInstance().getTag(SFMuiseSDK.MUISE_EVENT_LISTENER);
        if (!(tag instanceof com.taobao.android.xsearchplugin.weex.weex.h)) {
            return;
        }
        ((com.taobao.android.xsearchplugin.weex.weex.h) tag).b(str, jSONObject, aVar, aVar2);
    }
}
