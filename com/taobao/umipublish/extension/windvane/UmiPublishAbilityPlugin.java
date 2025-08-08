package com.taobao.umipublish.extension.windvane;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.framework.container.ut.c;
import com.taobao.android.litecreator.util.u;
import com.taobao.umipublish.extension.windvane.abilities.BaseAbility;
import com.taobao.umipublish.extension.windvane.abilities.DownloadFilesAbility;
import com.taobao.umipublish.extension.windvane.abilities.DownloadMaterialAbility;
import com.taobao.umipublish.extension.windvane.abilities.ImageStokeAbility;
import com.taobao.umipublish.extension.windvane.abilities.KfcCheckAbility;
import com.taobao.umipublish.extension.windvane.abilities.WVListener;
import com.taobao.umipublish.extension.windvane.call.WindvaneCall;
import com.taobao.umipublish.monitor.UmiPublishMonitor;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.ten;

/* loaded from: classes9.dex */
public class UmiPublishAbilityPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String PKG_NAME = "com.taobao.umipublish.extension.windvane.abilities";
    public static final String PLUGIN_NAME = "WVUmiPublishAbility";
    private static final Map<String, Class<? extends BaseAbility>> sAbilityMap;
    private static final Map<String, String> sAbilityNameMap;

    public static /* synthetic */ Object ipc$super(UmiPublishAbilityPlugin umiPublishAbilityPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(UmiPublishAbilityPlugin umiPublishAbilityPlugin, BaseAbility baseAbility, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fee7e439", new Object[]{umiPublishAbilityPlugin, baseAbility, str, wVCallBackContext});
        } else {
            umiPublishAbilityPlugin.doExecute(baseAbility, str, wVCallBackContext);
        }
    }

    static {
        kge.a(-282175448);
        sAbilityMap = new HashMap();
        sAbilityNameMap = new HashMap();
        sAbilityMap.put("downloadFiles", DownloadFilesAbility.class);
        sAbilityMap.put("downloadMaterialByIds", DownloadMaterialAbility.class);
        sAbilityMap.put("kfcCheck", KfcCheckAbility.class);
        sAbilityMap.put("imageCutoutAndStoke", ImageStokeAbility.class);
        sAbilityNameMap.put("uploadFiles", "com.taobao.umipublish.extension.windvane.abilities.UploadFilesAbility");
        sAbilityNameMap.put("contentPublish", "com.taobao.umipublish.extension.windvane.abilities.ContentPublishAbility");
        sAbilityNameMap.put("templateExport", "com.taobao.umipublish.extension.windvane.abilities.TemplateExportAbility");
        sAbilityNameMap.put("localImage2Base64", "com.taobao.umipublish.extension.windvane.abilities.LocalImage2Base64Ability");
        sAbilityNameMap.put("queryTaskStatus", "com.taobao.umipublish.extension.windvane.abilities.QueryTaskStatusAbility");
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, final String str2, final WVCallBackContext wVCallBackContext) {
        if (!StringUtils.isEmpty(str) && wVCallBackContext != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("className", PLUGIN_NAME);
            hashMap.put("funcName", str);
            new c("Page_GGTabs", "gg111.19920601").c(WindvaneCall.TAG, hashMap, true);
            Class<? extends BaseAbility> cls = sAbilityMap.get(str);
            final String str3 = sAbilityNameMap.get(str);
            if (cls == null && str3 == null) {
                return false;
            }
            BaseAbility baseAbility = null;
            try {
                if (cls != null) {
                    baseAbility = cls.newInstance();
                } else if (ten.a("guangguang", false)) {
                    baseAbility = (BaseAbility) Class.forName(str3).newInstance();
                } else {
                    ten.a(this.mContext, "guangguang", new ten.a() { // from class: com.taobao.umipublish.extension.windvane.UmiPublishAbilityPlugin.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.ten.a
                        public void a() {
                            try {
                                UmiPublishAbilityPlugin.access$000(UmiPublishAbilityPlugin.this, (BaseAbility) Class.forName(str3).newInstance(), str2, wVCallBackContext);
                            } catch (Throwable th) {
                                String stackTraceString = Log.getStackTraceString(th);
                                u.d(UmiPublishAbilityPlugin.PLUGIN_NAME, "execute ability error! e:" + stackTraceString);
                                UmiPublishMonitor.a().b(UmiPublishAbilityPlugin.PLUGIN_NAME, "-1", "execute_ability_error", stackTraceString);
                                wVCallBackContext.error();
                            }
                        }

                        @Override // tb.ten.a
                        public void a(String str4, String str5) {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str4, str5});
                            } else {
                                wVCallBackContext.error();
                            }
                        }
                    });
                }
                doExecute(baseAbility, str2, wVCallBackContext);
                return true;
            } catch (Throwable th) {
                String stackTraceString = Log.getStackTraceString(th);
                u.d(PLUGIN_NAME, "execute ability error! e:" + stackTraceString);
                UmiPublishMonitor.a().b(PLUGIN_NAME, "-1", "execute_ability_error", stackTraceString);
            }
        }
        return false;
    }

    private void doExecute(BaseAbility baseAbility, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b68fc6c", new Object[]{this, baseAbility, str, wVCallBackContext});
            return;
        }
        baseAbility.setContext(this.mContext);
        baseAbility.setListener(new WVListener(wVCallBackContext));
        baseAbility.execute(JSONObject.parseObject(str));
    }
}
