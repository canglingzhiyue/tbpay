package com.ap.zoloz.hummer.common;

import android.os.Bundle;
import android.util.Base64;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.alipay.mobile.security.zim.api.ZIMCallback;
import com.alipay.mobile.security.zim.api.ZIMFacade;
import com.alipay.mobile.security.zim.api.ZIMFacadeBuilder;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannelCallback;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.zoloz.zhub.common.factor.model.FactorNextResponse;
import com.zoloz.zhub.common.factor.model.FactorNextResponseInner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import mtopsdk.mtop.util.ErrorConstant;
import tb.cjn;
import tb.cjo;
import tb.cjr;
import tb.cjt;
import tb.kge;
import tb.rrv;

/* loaded from: classes3.dex */
public class NativeTask extends TaskTracker {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "NativeTask";
    private boolean isZimDestroyed;
    private ZIMFacade mZimFacade;
    private int nextIndexFromValidate;

    static {
        kge.a(-1654829750);
    }

    public static /* synthetic */ Object ipc$super(NativeTask nativeTask, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(NativeTask nativeTask, TaskConfig taskConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c534888c", new Object[]{nativeTask, taskConfig});
        } else {
            nativeTask.handleSystemError(taskConfig);
        }
    }

    public static /* synthetic */ void access$100(NativeTask nativeTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cadfadbf", new Object[]{nativeTask});
        } else {
            nativeTask.next();
        }
    }

    public static /* synthetic */ ZIMFacade access$200(NativeTask nativeTask) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ZIMFacade) ipChange.ipc$dispatch("706e8f6e", new Object[]{nativeTask}) : nativeTask.mZimFacade;
    }

    public static /* synthetic */ ZIMFacade access$202(NativeTask nativeTask, ZIMFacade zIMFacade) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ZIMFacade) ipChange.ipc$dispatch("6ada037a", new Object[]{nativeTask, zIMFacade});
        }
        nativeTask.mZimFacade = zIMFacade;
        return zIMFacade;
    }

    public static /* synthetic */ int access$300(NativeTask nativeTask) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3dcec8f0", new Object[]{nativeTask})).intValue() : nativeTask.nextIndexFromValidate;
    }

    public static /* synthetic */ int access$302(NativeTask nativeTask, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b14c4e9b", new Object[]{nativeTask, new Integer(i)})).intValue();
        }
        nativeTask.nextIndexFromValidate = i;
        return i;
    }

    public static /* synthetic */ void access$400(NativeTask nativeTask, b bVar, JSONObject jSONObject, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("808f206c", new Object[]{nativeTask, bVar, jSONObject, map});
        } else {
            nativeTask.addOutputParam(bVar, jSONObject, map);
        }
    }

    public static /* synthetic */ boolean access$502(NativeTask nativeTask, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c40daff", new Object[]{nativeTask, new Boolean(z)})).booleanValue();
        }
        nativeTask.isZimDestroyed = z;
        return z;
    }

    @Override // com.ap.zoloz.hummer.common.TaskTracker
    public void run(b bVar, final TaskConfig taskConfig, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("974ff795", new Object[]{this, bVar, taskConfig, gVar});
            return;
        }
        BioLog.i("NativeTask run called");
        this.isLive = true;
        this.mITaskTrackerCallback = gVar;
        this.mTaskConfig = taskConfig;
        if (taskConfig == null || bVar == null) {
            return;
        }
        this.mHummerContext = bVar;
        this.mHummerContext.a("currentTaskName", "context", taskConfig.name);
        this.mIAlertManagerCallback = new e() { // from class: com.ap.zoloz.hummer.common.NativeTask.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ap.zoloz.hummer.common.e
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    NativeTask.access$000(NativeTask.this, taskConfig);
                }
            }

            @Override // com.ap.zoloz.hummer.common.e
            public void a(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                } else if (z) {
                    NativeTask.access$100(NativeTask.this);
                } else if (NativeTask.this.mHummerContext == null) {
                } else {
                    NativeTask.this.mHummerContext.a(taskConfig.name, "Z7001");
                    NativeTask.this.mITaskTrackerCallback.a(NativeTask.this.mHummerContext, -1);
                }
            }
        };
        if (!taskConfig.inputParams.containsKey("zimId")) {
            this.mHummerContext.a(taskConfig.name, "Z7025");
            this.mHummerContext.b(taskConfig.name, "Z7025");
            a.a().a(this.mIAlertManagerCallback);
            return;
        }
        String str = (String) this.mHummerContext.a(String.valueOf(((Map) taskConfig.inputParams.get("zimId")).get("value")));
        if (!StringUtil.isNullorEmpty(str)) {
            if (!taskConfig.inputParams.containsKey(ZIMFacade.KEY_INIT_RESP)) {
                this.mHummerContext.a(taskConfig.name, "Z7032");
                this.mHummerContext.b(taskConfig.name, "Z7032");
                a.a().a(this.mIAlertManagerCallback);
                return;
            }
            String valueOf = String.valueOf(this.mHummerContext.a(String.valueOf(((Map) taskConfig.inputParams.get(ZIMFacade.KEY_INIT_RESP)).get("value"))));
            HashMap hashMap = new HashMap();
            hashMap.put("prodName", this.mTaskConfig.name);
            hashMap.put("zimId", str);
            h.a().a("zprodInit", hashMap);
            this.mZimFacade = ZIMFacadeBuilder.create(this.mHummerContext.b);
            this.isZimDestroyed = false;
            HashMap<String, String> hashMap2 = new HashMap<>();
            hashMap2.put(ZIMFacade.KEY_INIT_RESP, valueOf);
            if (taskConfig.inputParams.get("validateDelegate") != null && ((Boolean) ((Map) taskConfig.inputParams.get("validateDelegate")).get("value")).booleanValue()) {
                doZimTask(str, hashMap2, new ZimMessageChannel() { // from class: com.ap.zoloz.hummer.common.NativeTask.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel
                    public void onAction(Bundle bundle, final ZimMessageChannelCallback zimMessageChannelCallback) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("9b399c2d", new Object[]{this, bundle, zimMessageChannelCallback});
                            return;
                        }
                        String string = bundle.getString("requestData");
                        NativeTask.this.mHummerContext.a(NativeTask.this.mTaskConfig.name, "Z7035");
                        if (NativeTask.this.mHummerContext == null) {
                            return;
                        }
                        NativeTask.this.mHummerContext.a("validateRequest", "argument", string);
                        NativeTask.this.mHummerContext.g();
                        cjr.a().a(new cjo() { // from class: com.ap.zoloz.hummer.common.NativeTask.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // tb.cjo
                            public void a(cjt cjtVar) {
                                int i;
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("e3902acb", new Object[]{this, cjtVar});
                                } else if (NativeTask.this.mHummerContext != null && cjtVar != null) {
                                    Bundle bundle2 = new Bundle();
                                    FactorNextResponse factorNextResponse = cjtVar.f26322a;
                                    if (factorNextResponse == null || "network_exception".equals(cjtVar.b)) {
                                        bundle2.putString(ZimMessageChannel.K_RPC_RES, null);
                                        bundle2.putInt(ZimMessageChannel.K_RPC_RES_CODE, 3000);
                                        zimMessageChannelCallback.onResult(bundle2);
                                    } else if ("exception".equals(cjtVar.b) || factorNextResponse.response == null || factorNextResponse.response.size() <= 0) {
                                        NativeTask.this.mHummerContext.a(NativeTask.this.mTaskConfig.name, "Z7022");
                                        NativeTask.this.mHummerContext.b(NativeTask.this.mTaskConfig.name, "Z7022");
                                        if (NativeTask.access$200(NativeTask.this) != null) {
                                            NativeTask.access$200(NativeTask.this).command(4099);
                                            NativeTask.access$200(NativeTask.this).destroy();
                                            NativeTask.access$202(NativeTask.this, null);
                                        }
                                        NativeTask.this.isLive = false;
                                        if (NativeTask.this.mTaskConfig == null) {
                                            return;
                                        }
                                        NativeTask.access$000(NativeTask.this, NativeTask.this.mTaskConfig);
                                    } else if (ErrorConstant.ERRCODE_SYSTEM_ERROR.equals(factorNextResponse.response.get(0).retCode) || factorNextResponse.response.get(0).outParams == null || !factorNextResponse.response.get(0).outParams.containsKey("validateResponse")) {
                                        NativeTask.this.mHummerContext.a(NativeTask.this.mTaskConfig.name, factorNextResponse.response.get(0).retCodeSub);
                                        NativeTask.this.mHummerContext.b(NativeTask.this.mTaskConfig.name, factorNextResponse.response.get(0).retCodeSub);
                                        if (NativeTask.access$200(NativeTask.this) != null) {
                                            NativeTask.access$200(NativeTask.this).command(4099);
                                            NativeTask.access$200(NativeTask.this).destroy();
                                            NativeTask.access$202(NativeTask.this, null);
                                        }
                                        NativeTask.this.isLive = false;
                                        if (factorNextResponse.nextIndex.intValue() != 0) {
                                            NativeTask.access$302(NativeTask.this, factorNextResponse.nextIndex.intValue());
                                        }
                                        if (NativeTask.this.mTaskConfig == null) {
                                            return;
                                        }
                                        NativeTask.access$000(NativeTask.this, NativeTask.this.mTaskConfig);
                                    } else {
                                        String str2 = factorNextResponse.versionToken;
                                        if (!StringUtil.isNullorEmpty(str2)) {
                                            NativeTask.this.mHummerContext.a("versionToken", "context", str2);
                                        }
                                        NativeTask.access$302(NativeTask.this, factorNextResponse.nextIndex.intValue());
                                        NativeTask.this.mHummerContext.a(cjtVar.f26322a.zStack);
                                        for (int i2 = 0; i2 < factorNextResponse.response.size(); i2++) {
                                            if (factorNextResponse.response.get(i2).outParams != null) {
                                                for (Map.Entry<String, Object> entry : factorNextResponse.response.get(i2).outParams.entrySet()) {
                                                    NativeTask.this.mHummerContext.a(entry.getKey(), "serverResponse", entry.getValue());
                                                }
                                            }
                                        }
                                        String str3 = new String(Base64.decode((String) factorNextResponse.response.get(0).outParams.get("validateResponse"), 8));
                                        if (!"SYSTEM_SUCCESS".equals(factorNextResponse.response.get(0).retCode)) {
                                            if ("VERIFY_RETRY".equals(factorNextResponse.response.get(0).retCode) || "VERIFY_NEXT".equals(factorNextResponse.response.get(0).retCode)) {
                                                bundle2.putInt(ZimMessageChannel.K_RPC_RES_CODE, 3000);
                                            } else if ("VERIFY_FAILURE".equals(factorNextResponse.response.get(0).retCode)) {
                                                i = 2006;
                                            }
                                            bundle2.putString(ZimMessageChannel.K_RPC_RES, str3);
                                            zimMessageChannelCallback.onResult(bundle2);
                                        }
                                        i = 1000;
                                        bundle2.putInt(ZimMessageChannel.K_RPC_RES_CODE, i);
                                        bundle2.putString(ZimMessageChannel.K_RPC_RES, str3);
                                        zimMessageChannelCallback.onResult(bundle2);
                                    }
                                }
                            }
                        }, cjr.a().a(NativeTask.this.mHummerContext, NativeTask.this.mHummerContext.c("validate"), false));
                    }
                });
                return;
            } else {
                doZimTask(str, hashMap2, null);
                return;
            }
        }
        this.mHummerContext.a(taskConfig.name, "Z7018");
        this.mHummerContext.b(taskConfig.name, "Z7018");
        a.a().a(this.mIAlertManagerCallback);
    }

    private void handleSystemError(TaskConfig taskConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("551aafd4", new Object[]{this, taskConfig});
        } else if (this.nextIndexFromValidate != 0) {
            this.mITaskTrackerCallback.a(this.mHummerContext, this.nextIndexFromValidate);
        } else {
            int i = -1;
            if (taskConfig.navigateConfig.containsKey("error")) {
                i = ((Integer) ((Map) taskConfig.navigateConfig.get("error")).get("index")).intValue();
            }
            this.mITaskTrackerCallback.a(this.mHummerContext, i);
        }
    }

    private void doZimTask(final String str, HashMap<String, String> hashMap, ZimMessageChannel zimMessageChannel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c16280", new Object[]{this, str, hashMap, zimMessageChannel});
            return;
        }
        BioLog.i("NativeTask call mZimFacade.verify");
        this.mZimFacade.verify(str, hashMap, zimMessageChannel, new ZIMCallback() { // from class: com.ap.zoloz.hummer.common.NativeTask.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Code restructure failed: missing block: B:35:0x0120, code lost:
                if (r9.b.mTaskConfig.navigateConfig.containsKey(r5) != false) goto L53;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x0122, code lost:
                r5 = r9.b;
                com.ap.zoloz.hummer.common.NativeTask.access$400(r5, r5.mHummerContext, (com.alibaba.fastjson.JSONObject) ((java.util.Map) r9.b.mTaskConfig.navigateConfig.get(r5)).get("outputParams"), r10.extInfo);
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x0198, code lost:
                if (r9.b.mTaskConfig.navigateConfig.containsKey(r5) != false) goto L53;
             */
            /* JADX WARN: Removed duplicated region for block: B:56:0x01dc  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x01e5  */
            @Override // com.alipay.mobile.security.zim.api.ZIMCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean response(com.alipay.mobile.security.zim.api.ZIMResponse r10) {
                /*
                    Method dump skipped, instructions count: 552
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ap.zoloz.hummer.common.NativeTask.AnonymousClass3.response(com.alipay.mobile.security.zim.api.ZIMResponse):boolean");
            }
        });
    }

    private void next() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54d45dfa", new Object[]{this});
        } else if (this.mHummerContext == null || this.mHummerContext.b == null) {
        } else {
            this.mHummerContext.g();
            cjr.a().a(new cjo() { // from class: com.ap.zoloz.hummer.common.NativeTask.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.cjo
                public void a(cjt cjtVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e3902acb", new Object[]{this, cjtVar});
                    } else if (NativeTask.this.mHummerContext != null && cjtVar != null) {
                        FactorNextResponse factorNextResponse = cjtVar.f26322a;
                        if (factorNextResponse == null || "network_exception".equals(cjtVar.b)) {
                            a.a().b(NativeTask.this.mIAlertManagerCallback);
                        } else if ("exception".equals(cjtVar.b) || factorNextResponse.response == null || factorNextResponse.response.size() <= 0) {
                            NativeTask.this.mHummerContext.a(NativeTask.this.mTaskConfig.name, "Z7022");
                            NativeTask.this.mHummerContext.b(NativeTask.this.mTaskConfig.name, "Z7022");
                            a.a().a(NativeTask.this.mIAlertManagerCallback);
                        } else {
                            String str = factorNextResponse.versionToken;
                            if (!StringUtil.isNullorEmpty(str)) {
                                NativeTask.this.mHummerContext.a("versionToken", "context", str);
                            }
                            NativeTask.this.mHummerContext.a(cjtVar.f26322a.zStack);
                            FactorNextResponseInner factorNextResponseInner = factorNextResponse.response.get(0);
                            if (!"SYSTEM_SUCCESS".equals(factorNextResponseInner.retCode)) {
                                NativeTask.this.mHummerContext.a(NativeTask.this.mTaskConfig.name, factorNextResponseInner.retCodeSub);
                                NativeTask.this.mHummerContext.b("serverTask", factorNextResponseInner.retCodeSub);
                                a.a().a(NativeTask.this.mIAlertManagerCallback);
                                return;
                            }
                            for (int i = 0; i < factorNextResponse.response.size(); i++) {
                                if (factorNextResponse.response.get(i).outParams != null) {
                                    for (Map.Entry<String, Object> entry : factorNextResponse.response.get(i).outParams.entrySet()) {
                                        NativeTask.this.mHummerContext.a(entry.getKey(), "serverResponse", entry.getValue());
                                    }
                                }
                            }
                            NativeTask.this.mITaskTrackerCallback.a(NativeTask.this.mHummerContext, factorNextResponse.nextIndex.intValue());
                        }
                    }
                }
            }, cjr.a().a(this.mHummerContext, ((Integer) this.mHummerContext.a(cjn.ZIM_IDENTIFY_NEXTINDEX)).intValue(), true));
        }
    }

    private void addOutputParam(b bVar, JSONObject jSONObject, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f2e6b02", new Object[]{this, bVar, jSONObject, map});
        } else if (jSONObject == null) {
        } else {
            Iterator<Object> it = jSONObject.values().iterator();
            while (it.hasNext()) {
                JSONObject jSONObject2 = (JSONObject) it.next();
                String str = (String) jSONObject2.get("pipeType");
                String str2 = (String) jSONObject2.get("value");
                if (map.get(str2) != null) {
                    bVar.a(str2, str, map.get(str2));
                }
            }
        }
    }

    @Override // com.ap.zoloz.hummer.common.TaskTracker
    public void forceQuit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6896bb61", new Object[]{this});
        } else if (this.mZimFacade == null || this.isZimDestroyed || !this.isLive) {
        } else {
            if (this.mTaskConfig != null) {
                BioLog.i("NativeTask " + this.mTaskConfig.name + " forceQuit");
                HashMap hashMap = new HashMap();
                hashMap.put("extInfo", "force quit zim " + this.mTaskConfig.name);
                h.a().a(rrv.TECH_SEED, hashMap);
            }
            this.mZimFacade.command(4099);
            this.mZimFacade.destroy();
            this.mZimFacade = null;
            this.isLive = false;
        }
    }
}
