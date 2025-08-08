package com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin;

import android.content.Context;
import android.content.DialogInterface;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.template.FBPlugin;
import com.alipay.android.app.template.FBPluginCtx;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.data.ModuleDataModel;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.module.utils.DataHelper;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBLinearLayout;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class VIFBUnitedView extends BaseFBPlugin {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5896a = "VIFBUnitedView";
    private static String b = "";
    private Context c;
    private FBPluginCtx d;
    private int e;
    private BaseFBPlugin f;
    private FBLinearLayout g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;

    public static /* synthetic */ Object ipc$super(VIFBUnitedView vIFBUnitedView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1095196941) {
            if (hashCode != 1957656601) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.setNode(((Number) objArr[0]).longValue());
            return null;
        }
        return new Long(super.getNode());
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public void bindModule(MicroModule microModule, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c61b9cc", new Object[]{this, microModule, str});
        }
    }

    public VIFBUnitedView(Context context, FBPluginCtx fBPluginCtx, int i) {
        super(context, fBPluginCtx);
        this.f = null;
        this.h = null;
        this.k = "";
        this.l = "";
        this.m = "";
        this.c = context;
        this.d = fBPluginCtx;
        this.e = i;
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public String getPluginName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fd12a725", new Object[]{this}) : this.f.getPluginName();
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.f.clear();
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public void handleEngineCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b64b42b", new Object[]{this});
        } else {
            this.f.handleEngineCancel();
        }
    }

    public FBPlugin createPluginInstance(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBPlugin) ipChange.ipc$dispatch("639cf81d", new Object[]{this, str, str2, str3});
        }
        if (StringUtils.equals(ModuleConstants.VI_MODULE_NAME_PAYMENT_PASSWORD_PLUS, str)) {
            return a(VIFBPluginFactory.FingerprintPluginClassName);
        }
        if (!StringUtils.equals(ModuleConstants.VI_MODULE_NAME_PAY_PWD, str)) {
            return null;
        }
        if (StringUtils.equals(str3, "Y")) {
            VerifyLogCat.i(f5896a, "supportNoPwdUI Y");
            return a(VIFBPluginFactory.PasswordPluginWithoutUIClassName);
        } else if (StringUtils.equals(str2, "Y")) {
            VerifyLogCat.i(f5896a, "supportEmbedVi Y");
            return a(VIFBPluginFactory.PasswordUnifiedPluginNewClassName);
        } else {
            return a(VIFBPluginFactory.PasswordInputUnifiedPluginClassName);
        }
    }

    private FBPlugin a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FBPlugin) ipChange.ipc$dispatch("d6bfe134", new Object[]{this, str}) : VIFBPluginFactory.getFBPluginByClassName(str, this.c, this.d, this.e);
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        this.g = (FBLinearLayout) ((LayoutInflater) this.c.getSystemService("layout_inflater")).inflate(R.layout.fb_common_plugin, (ViewGroup) null);
        return this.g;
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean updateFunc(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9446144c", new Object[]{this, str, str2})).booleanValue();
        }
        BaseFBPlugin baseFBPlugin = this.f;
        if (baseFBPlugin == null) {
            return false;
        }
        return baseFBPlugin.updateFunc(str, str2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:177:0x04ed
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:82)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private boolean b(java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 1271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.VIFBUnitedView.b(java.lang.String):boolean");
    }

    private static String c(String str) {
        ModuleDataModel parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        try {
            parse = ModuleDataModel.parse(str);
        } catch (Throwable unused) {
        }
        if (parse == null) {
            VerifyLogCat.w(f5896a, "解析moduleData失败！！！！");
            return "";
        }
        JSONObject parseObject = JSON.parseObject(parse.data);
        JSONObject jSONObject = parseObject.getJSONObject("predata");
        if (jSONObject != null) {
            String string = jSONObject.getString("type");
            if (StringUtils.isEmpty(string)) {
                String string2 = jSONObject.getString("bioTypes");
                if (!StringUtils.isEmpty(string2)) {
                    JSONArray parseArray = JSON.parseArray(string2);
                    if ((parseArray != null) & (parseArray.size() > 0)) {
                        string = parseArray.getString(0);
                    }
                }
            }
            if (DataHelper.FP_TYPE_VALUE.equals(string)) {
                String string3 = parseObject.getString("bicProd");
                return ("4".equalsIgnoreCase(string3) || "faceId".equalsIgnoreCase(string3)) ? BaseFBPlugin.VERIFY_TYPE.faceid : "fp";
            } else if (DataHelper.FACEID_TYPE_VALUE.equals(string)) {
                return BaseFBPlugin.VERIFY_TYPE.faceid;
            } else {
                if (DataHelper.ZFACE_TYPE_VALUE.equals(string)) {
                    return "zface";
                }
            }
        }
        Boolean bool = parseObject.getBoolean("isSimplePPW");
        return true == bool.booleanValue() ? BaseFBPlugin.VERIFY_TYPE.sp : !bool.booleanValue() ? BaseFBPlugin.VERIFY_TYPE.pp : "";
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        if (StringUtils.isEmpty(this.i)) {
            this.i = "N";
        }
        return this.i;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            MicroModuleContext.getInstance().alert("", this.c.getResources().getString(R.string.verifyidentity_wrong_data), this.c.getResources().getString(R.string.verifyidentity_confirm), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.VIFBUnitedView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else {
                        VIFBUnitedView.this.updateVerifyStatus(BaseFBPlugin.VERIFY_STATUS.abort);
                    }
                }
            }, null, null);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin, com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean updateAttr(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a285a79", new Object[]{this, str, str2})).booleanValue();
        }
        BaseFBPlugin baseFBPlugin = this.f;
        if (baseFBPlugin != null && baseFBPlugin.updateAttr(str, str2)) {
            return true;
        }
        if (str.equals("src")) {
            return b(str2);
        }
        if (str.equals("class")) {
            String str3 = f5896a;
            VerifyLogCat.i(str3, "[birdnest log]: " + str2);
        }
        return false;
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin, android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else {
            this.f.onClick(view);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin, android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
        } else {
            this.f.onFocusChange(view, z);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin, com.alipay.android.app.template.FBFocusable
    public void requestFocus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10da4b90", new Object[]{this});
        } else {
            this.f.requestFocus();
        }
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean setRect(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3d89c71", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)})).booleanValue();
        }
        BaseFBPlugin baseFBPlugin = this.f;
        if (baseFBPlugin == null) {
            return false;
        }
        return baseFBPlugin.setRect(f, f2, f3, f4);
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean updateCSS(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c310ec99", new Object[]{this, str, str2})).booleanValue();
        }
        BaseFBPlugin baseFBPlugin = this.f;
        if (baseFBPlugin == null) {
            return false;
        }
        return baseFBPlugin.updateCSS(str, str2);
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean updateEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("278e3c70", new Object[]{this, str, str2})).booleanValue();
        }
        BaseFBPlugin baseFBPlugin = this.f;
        if (baseFBPlugin == null) {
            return false;
        }
        return baseFBPlugin.updateEvent(str, str2);
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean onLoadFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b23670e3", new Object[]{this})).booleanValue();
        }
        BaseFBPlugin baseFBPlugin = this.f;
        if (baseFBPlugin == null) {
            return false;
        }
        return baseFBPlugin.onLoadFinish();
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public String getEncryptValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71c53bb7", new Object[]{this});
        }
        BaseFBPlugin baseFBPlugin = this.f;
        if (baseFBPlugin == null) {
            return null;
        }
        return baseFBPlugin.getEncryptValue();
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin
    public long getNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("beb89ef3", new Object[]{this})).longValue();
        }
        VerifyLogCat.i(f5896a, "getNode()");
        return super.getNode();
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public void setNode(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74af7819", new Object[]{this, new Long(j)});
            return;
        }
        String str = f5896a;
        VerifyLogCat.i(str, "setNode()：" + j);
        super.setNode(j);
        BaseFBPlugin baseFBPlugin = this.f;
        if (baseFBPlugin == null) {
            return;
        }
        baseFBPlugin.setNode(j);
    }
}
