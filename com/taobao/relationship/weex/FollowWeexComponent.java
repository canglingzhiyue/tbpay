package com.taobao.relationship.weex;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.relationship.module.FollowModule;
import com.taobao.relationship.module.a;
import com.taobao.relationship.view.FollowWeexButton;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXVContainer;
import tb.kge;
import tb.nmd;
import tb.nme;
import tb.nmf;
import tb.nmj;

/* loaded from: classes7.dex */
public class FollowWeexComponent extends WXComponent<FollowWeexButton> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FollowWeexButton mFollowButton;
    private a mFollowContext;
    private FollowModule mFollowModule;
    private boolean mHasInit;
    private nmd mOperateConfig;
    private nme mViewConfig;

    static {
        kge.a(1302478913);
    }

    public static /* synthetic */ Object ipc$super(FollowWeexComponent followWeexComponent, String str, Object... objArr) {
        if (str.hashCode() == -869057037) {
            super.bindData((WXComponent) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public FollowWeexComponent(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData, FollowModule followModule) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
        this.mHasInit = false;
    }

    public FollowWeexComponent(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, int i, BasicComponentData basicComponentData, FollowModule followModule) {
        super(wXSDKInstance, wXVContainer, i, basicComponentData);
        this.mHasInit = false;
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    /* renamed from: initComponentHostView  reason: collision with other method in class */
    public FollowWeexButton mo1592initComponentHostView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FollowWeexButton) ipChange.ipc$dispatch("a75a9c6e", new Object[]{this, context});
        }
        this.mFollowButton = new FollowWeexButton(context);
        return this.mFollowButton;
    }

    public void setParams(String str) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bacff519", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str) || (parseObject = JSON.parseObject(str)) == null) {
        } else {
            this.mFollowContext = new a();
            if (parseObject.containsKey("accountId")) {
                this.mFollowContext.f18972a = parseObject.getLong("accountId").longValue();
            } else if (parseObject.containsKey("followedId")) {
                this.mFollowContext.f18972a = parseObject.getLong("followedId").longValue();
            }
            if (parseObject.containsKey("accountType")) {
                this.mFollowContext.b = parseObject.getInteger("accountType").intValue();
            }
            if (parseObject.containsKey("type")) {
                this.mFollowContext.g = parseObject.getInteger("type").intValue();
            }
            if (parseObject.containsKey("option")) {
                this.mFollowContext.h = parseObject.getInteger("option").intValue();
            }
            this.mFollowContext.c = parseObject.getString("originBiz");
            if (parseObject.containsKey("originPage")) {
                this.mFollowContext.d = parseObject.getString("originPage");
            }
            if (parseObject.containsKey("originFlag")) {
                this.mFollowContext.e = parseObject.getString("originFlag");
            }
            if (this.mFollowButton == null || getInstance() == null || !(getInstance().O() instanceof Activity)) {
                return;
            }
            this.mFollowModule = new FollowModule((Activity) getInstance().O(), this.mFollowContext, this.mFollowButton);
        }
    }

    public void setViewconfig(String str) {
        JSONObject parseObject;
        String[] split;
        String[] split2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1aa39fa", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str) || (parseObject = JSON.parseObject(str)) == null) {
        } else {
            this.mViewConfig = new nme();
            String string = parseObject.getString("followSize");
            if (!StringUtils.isEmpty(string) && (split2 = string.split(",")) != null && split2.length > 0) {
                this.mViewConfig.c = Integer.parseInt(split2[0]);
                this.mViewConfig.d = Integer.parseInt(split2[1]);
            }
            String string2 = parseObject.getString("unFollowSize");
            if (!StringUtils.isEmpty(string2) && (split = string2.split(",")) != null && split.length > 0) {
                this.mViewConfig.f31571a = Integer.parseInt(split[0]);
                this.mViewConfig.b = Integer.parseInt(split[1]);
            }
            if (parseObject.containsKey("followTitleSize")) {
                this.mViewConfig.e = parseObject.getInteger("followTitleSize").intValue();
            }
            if (parseObject.containsKey("unFollowTitleSize")) {
                this.mViewConfig.f = parseObject.getInteger("unFollowTitleSize").intValue();
            }
            if (parseObject.containsKey("followImageSize")) {
                this.mViewConfig.g = parseObject.getInteger("followImageSize").intValue();
            }
            if (parseObject.containsKey("unFollowImageSize")) {
                this.mViewConfig.h = parseObject.getInteger("unFollowImageSize").intValue();
            }
            if (parseObject.containsKey("followTitleColor")) {
                this.mViewConfig.i = nmj.b(parseObject.getString("followTitleColor"));
            }
            if (parseObject.containsKey("unFollowTitleColor")) {
                this.mViewConfig.j = nmj.b(parseObject.getString("unFollowTitleColor"));
            }
            if (parseObject.containsKey("followBackgroundColor")) {
                this.mViewConfig.m = nmj.b(parseObject.getString("followBackgroundColor"));
            }
            if (parseObject.containsKey("unFollowBackgroundColor")) {
                this.mViewConfig.n = nmj.b(parseObject.getString("unFollowBackgroundColor"));
            }
            if (parseObject.containsKey("borderCornerRadius")) {
                int intValue = parseObject.getInteger("borderCornerRadius").intValue();
                nme nmeVar = this.mViewConfig;
                float f = intValue;
                nmeVar.q = f;
                nmeVar.r = f;
            }
            if (parseObject.containsKey("followBorderWidth")) {
                this.mViewConfig.o = parseObject.getInteger("followBorderWidth").intValue();
            }
            if (parseObject.containsKey("unFollowBorderWidth")) {
                this.mViewConfig.p = parseObject.getInteger("unFollowBorderWidth").intValue();
            }
            if (parseObject.containsKey("hasFollowIcon")) {
                this.mViewConfig.t = parseObject.getBoolean("hasFollowIcon").booleanValue();
            }
            if (parseObject.containsKey("isUnfollowGradientBackground")) {
                this.mViewConfig.u = parseObject.getBoolean("isUnfollowGradientBackground").booleanValue();
            }
            if (parseObject.containsKey("unfollowGradientLetfColor")) {
                this.mViewConfig.v = nmj.b(parseObject.getString("unfollowGradientLetfColor"));
            }
            if (!parseObject.containsKey("unfollowGradientRightColor")) {
                return;
            }
            this.mViewConfig.w = nmj.b(parseObject.getString("unfollowGradientRightColor"));
        }
    }

    public void setOperateconfig(String str) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f261bc15", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str) || (parseObject = JSON.parseObject(str)) == null) {
        } else {
            this.mOperateConfig = new nmd();
            if (parseObject.containsKey("cancelAutoCheckForState")) {
                this.mOperateConfig.j = parseObject.getBoolean("cancelAutoCheckForState").booleanValue();
            }
            if (parseObject.containsKey(nmf.MTOP_ISFOLLOW)) {
                this.mOperateConfig.k = parseObject.getBoolean(nmf.MTOP_ISFOLLOW).booleanValue();
            }
            if (parseObject.containsKey("hideFollowAnimation")) {
                this.mOperateConfig.c = parseObject.getBoolean("hideFollowAnimation").booleanValue();
            }
            if (parseObject.containsKey("hideUnFollowActionSheet")) {
                this.mOperateConfig.b = parseObject.getBoolean("hideUnFollowActionSheet").booleanValue();
            }
            if (parseObject.containsKey("syncFollowStatus")) {
                this.mOperateConfig.i = parseObject.getBoolean("syncFollowStatus").booleanValue();
            }
            if (parseObject.containsKey("toastImgURL")) {
                this.mOperateConfig.g = parseObject.getString("toastImgURL");
            }
            if (!parseObject.containsKey("cardImgURL")) {
                return;
            }
            this.mOperateConfig.h = parseObject.getString("cardImgURL");
        }
    }

    private void followInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("640b4068", new Object[]{this});
            return;
        }
        FollowModule followModule = this.mFollowModule;
        if (followModule == null) {
            return;
        }
        nmd nmdVar = this.mOperateConfig;
        if (nmdVar != null) {
            followModule.a(nmdVar);
        }
        nme nmeVar = this.mViewConfig;
        if (nmeVar != null) {
            this.mFollowModule.a(nmeVar);
        }
        this.mFollowModule.a();
        this.mHasInit = true;
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void bindData(WXComponent wXComponent) {
        Object obj;
        Object obj2;
        Object obj3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc333df3", new Object[]{this, wXComponent});
            return;
        }
        super.bindData(wXComponent);
        if (this.mHasInit || getAttrs() == null) {
            return;
        }
        if (getAttrs().containsKey("params") && (obj3 = getAttrs().get("params")) != null) {
            setParams(obj3.toString());
        }
        if (getAttrs().containsKey("viewconfig") && (obj2 = getAttrs().get("viewconfig")) != null) {
            setViewconfig(obj2.toString());
        }
        if (getAttrs().containsKey("operateconfig") && (obj = getAttrs().get("operateconfig")) != null) {
            setOperateconfig(obj.toString());
        }
        followInit();
    }
}
