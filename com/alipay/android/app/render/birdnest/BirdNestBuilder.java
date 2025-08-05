package com.alipay.android.app.render.birdnest;

import android.content.Context;
import android.content.res.Resources;
import com.alipay.android.app.render.api.ICashierProvider;
import com.alipay.android.app.render.birdnest.service.BirdNestManager;
import com.alipay.android.app.render.birdnest.service.BirdNestService;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.app.template.FBBridge;
import com.alipay.android.app.template.FBContext;
import com.alipay.android.app.template.FBPluginFactory;
import com.alipay.android.app.template.FBResourceClient;
import com.alipay.android.app.template.OnLoadCallback;
import com.alipay.android.app.template.TemplateKeyboardService;
import com.alipay.android.app.template.TemplatePasswordService;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.deploy.model.FBTemplateContent;
import com.flybird.session.standalone.model.CreateEngineOptions;
import com.flybird.session.standalone.model.PrepareResult;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.HashMap;
import java.util.Map;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class BirdNestBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int actionBarHeight;
    public Map<String, String> appParams;
    public String bundleName;
    public String businessId;
    public OnLoadCallback callback;
    public Context context;
    public Resources contextResources;
    public String data;
    public int displayHeight;
    public int displayWidth;
    public FBBridge eventBridge;
    public Object eventTarget;
    public FBPluginFactory factory;
    public RenderCallbackProxy mCallbackProxy;
    public ICashierProvider mCashierProvider;
    public CreateEngineOptions mCreateEngineOptions;
    public TemplateKeyboardService mKeyboardService;
    public TemplatePasswordService mPasswordService;
    public FBResourceClient resourceClient;
    public FBTemplateContent templateContent;
    public String tplHtml;
    public String tplId;
    public String tplJson;
    public boolean jsDebugger = false;
    public boolean useQuickPayTemplateManager = false;

    /* renamed from: a  reason: collision with root package name */
    private boolean f4364a = false;
    private boolean b = false;

    public BirdNestBuilder(Context context) {
        this.context = context;
    }

    @Deprecated
    public FBContext create() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBContext) ipChange.ipc$dispatch("51b19631", new Object[]{this});
        }
        if (this.b) {
            throw new RuntimeException("BirdNestBuilder is Expired!\n");
        }
        BirdNestService create = BirdNestManager.create(this.mCashierProvider);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (this.f4364a) {
                if (this.appParams == null) {
                    this.appParams = new HashMap();
                }
                this.appParams.put("asynclayout", "true");
                if (this.callback == null) {
                    this.callback = new AsyncOnLoadCallback();
                }
            }
            FBContext buildFBContext = create.buildFBContext(this);
            String str = this.tplId;
            if (str != null && str.startsWith("QUICKPAY@")) {
                str = str.substring(9);
            }
            LogUtils.record(2, "FBContext::create", "fc=" + buildFBContext + ", tplId=" + str + ", time cost: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
            if (buildFBContext != null) {
                this.context = null;
                this.data = null;
                this.tplHtml = null;
                this.tplJson = null;
                this.templateContent = null;
                this.b = true;
            }
            return buildFBContext;
        } catch (Exception e) {
            LogUtils.printExceptionStackTrace(e);
            BirdNestManager.resetService();
            throw e;
        }
    }

    public PrepareResult createResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PrepareResult) ipChange.ipc$dispatch("217018a7", new Object[]{this});
        }
        if (this.b) {
            throw new RuntimeException("BirdNestBuilder is Expired!\n");
        }
        BirdNestService create = BirdNestManager.create(this.mCashierProvider);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (this.f4364a) {
                if (this.appParams == null) {
                    this.appParams = new HashMap();
                }
                this.appParams.put("asynclayout", "true");
                if (this.callback == null) {
                    this.callback = new AsyncOnLoadCallback();
                }
            }
            PrepareResult buildPrepareResult = create.buildPrepareResult(this);
            String str = this.tplId;
            if (str != null && str.startsWith("QUICKPAY@")) {
                str = str.substring(9);
            }
            LogUtils.record(2, "FBContext::createResult", "fc=" + buildPrepareResult + ", tplId=" + str + ", time cost: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
            if (buildPrepareResult != null) {
                this.context = null;
                this.data = null;
                this.tplHtml = null;
                this.tplJson = null;
                this.templateContent = null;
                this.b = true;
            }
            return buildPrepareResult;
        } catch (Exception e) {
            LogUtils.printExceptionStackTrace(e);
            BirdNestManager.resetService();
            throw e;
        }
    }

    public BirdNestBuilder setCallbackProxy(RenderCallbackProxy renderCallbackProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BirdNestBuilder) ipChange.ipc$dispatch("592ac811", new Object[]{this, renderCallbackProxy});
        }
        this.mCallbackProxy = renderCallbackProxy;
        return this;
    }

    public BirdNestBuilder setCashierProvider(ICashierProvider iCashierProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BirdNestBuilder) ipChange.ipc$dispatch("10d831d1", new Object[]{this, iCashierProvider});
        }
        this.mCashierProvider = iCashierProvider;
        return this;
    }

    public BirdNestBuilder setDataContent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BirdNestBuilder) ipChange.ipc$dispatch("539ee967", new Object[]{this, str});
        }
        this.data = str;
        return this;
    }

    public BirdNestBuilder setTemplateId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BirdNestBuilder) ipChange.ipc$dispatch("ce85681d", new Object[]{this, str});
        }
        this.tplId = str;
        return this;
    }

    public BirdNestBuilder setTemplateHtml(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BirdNestBuilder) ipChange.ipc$dispatch("9cc8ce8d", new Object[]{this, str});
        }
        this.tplHtml = str;
        return this;
    }

    public BirdNestBuilder setTemplateJson(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BirdNestBuilder) ipChange.ipc$dispatch("c01c7c70", new Object[]{this, str});
        }
        this.tplJson = str;
        this.templateContent = null;
        return this;
    }

    public BirdNestBuilder setTemplateJson(FBTemplateContent fBTemplateContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BirdNestBuilder) ipChange.ipc$dispatch("117a7f71", new Object[]{this, fBTemplateContent});
        }
        this.templateContent = fBTemplateContent;
        this.tplJson = null;
        return this;
    }

    public BirdNestBuilder setPluginFactory(FBPluginFactory fBPluginFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BirdNestBuilder) ipChange.ipc$dispatch("35c0be6b", new Object[]{this, fBPluginFactory});
        }
        this.factory = fBPluginFactory;
        return this;
    }

    public BirdNestBuilder setmKeyboardService(TemplateKeyboardService templateKeyboardService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BirdNestBuilder) ipChange.ipc$dispatch("941de8f2", new Object[]{this, templateKeyboardService});
        }
        this.mKeyboardService = templateKeyboardService;
        return this;
    }

    public BirdNestBuilder setUseQuickPayTemplateManager(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BirdNestBuilder) ipChange.ipc$dispatch("945876ab", new Object[]{this, new Boolean(z)});
        }
        this.useQuickPayTemplateManager = z;
        return this;
    }

    public BirdNestBuilder setAsyncLayout(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BirdNestBuilder) ipChange.ipc$dispatch("b7ab8dc", new Object[]{this, new Boolean(z)});
        }
        this.f4364a = z;
        return this;
    }

    public BirdNestBuilder setBizId(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BirdNestBuilder) ipChange.ipc$dispatch("bc6c5ed6", new Object[]{this, obj});
        }
        this.businessId = String.valueOf(obj);
        return this;
    }

    public BirdNestBuilder setAppParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BirdNestBuilder) ipChange.ipc$dispatch("843c664c", new Object[]{this, map});
        }
        this.appParams = map;
        return this;
    }

    public BirdNestBuilder setResourceClient(FBResourceClient fBResourceClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BirdNestBuilder) ipChange.ipc$dispatch("2db99059", new Object[]{this, fBResourceClient});
        }
        this.resourceClient = fBResourceClient;
        return this;
    }

    public BirdNestBuilder setDisplayHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BirdNestBuilder) ipChange.ipc$dispatch("84e4f990", new Object[]{this, new Integer(i)});
        }
        this.displayHeight = i;
        return this;
    }

    public BirdNestBuilder setDisplayWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BirdNestBuilder) ipChange.ipc$dispatch("b4f6c56f", new Object[]{this, new Integer(i)});
        }
        this.displayWidth = i;
        return this;
    }

    public BirdNestBuilder setCreateEngineOptions(CreateEngineOptions createEngineOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BirdNestBuilder) ipChange.ipc$dispatch("1777e10b", new Object[]{this, createEngineOptions});
        }
        this.mCreateEngineOptions = createEngineOptions;
        return this;
    }
}
