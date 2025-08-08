package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import com.ali.user.mobile.login.model.LoginConstant;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.tao.flexbox.layoutmanager.container.f;
import com.taobao.tao.flexbox.layoutmanager.player.b;
import com.taobao.taolive.uikit.mtop.HpBannerFrontData;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class spe implements spc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private spg f33803a;

    static {
        kge.a(-2076650366);
        kge.a(483350907);
    }

    private static String c(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cb45e484", new Object[]{fluidContext}) : fluidContext.getInstanceConfig().getPreCoverKey();
    }

    @Override // tb.spc
    public void b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f4da19b", new Object[]{this, fluidContext});
        } else {
            ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j().b(b.a().j(c(fluidContext)));
        }
    }

    @Override // tb.spc
    public a a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("70e78316", new Object[]{this, fluidContext});
        }
        try {
            JSONObject k = b.a().k(c(fluidContext));
            if (StringUtils.isEmpty(k.getString("cardLayout"))) {
                k = (JSONObject) ohh.a("video_clicked_cardData");
            }
            MediaContentDetailData mediaContentDetailData = new MediaContentDetailData();
            mediaContentDetailData.type = "VIDEO";
            mediaContentDetailData.index = k.getIntValue("index");
            mediaContentDetailData.account = a(k.getJSONObject(LoginConstant.ACCOUNT));
            mediaContentDetailData.content = b(k.getJSONObject("content"));
            mediaContentDetailData.interaction = c(k);
            mediaContentDetailData.id = mediaContentDetailData.content.id;
            return new a(mediaContentDetailData, a(mediaContentDetailData));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // tb.spc
    public void a(FluidContext fluidContext, Context context, f fVar, ViewGroup viewGroup, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11536127", new Object[]{this, fluidContext, context, fVar, viewGroup, new Boolean(z)});
            return;
        }
        this.f33803a = new sph(context, fVar, fluidContext, viewGroup, z);
        this.f33803a.k();
    }

    @Override // tb.spc
    public RotateAnimation a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RotateAnimation) ipChange.ipc$dispatch("ce529029", new Object[]{this}) : this.f33803a.a();
    }

    @Override // tb.spc
    public void a(FluidContext fluidContext, List<a> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6090a3a9", new Object[]{this, fluidContext, list, new Boolean(z)});
        } else if (z) {
            ((IDataService) fluidContext.getService(IDataService.class)).setMediaSet(list);
        } else {
            ((IDataService) fluidContext.getService(IDataService.class)).updateMediaSet(list);
        }
    }

    private MediaContentDetailData.Account a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaContentDetailData.Account) ipChange.ipc$dispatch("e1490898", new Object[]{this, jSONObject});
        }
        MediaContentDetailData.Account account = new MediaContentDetailData.Account();
        MediaContentDetailData.Pic pic = new MediaContentDetailData.Pic();
        pic.height = ils.ARCH_BIT64;
        pic.width = ils.ARCH_BIT64;
        pic.url = jSONObject.getString("avatarUrl");
        pic.type = HpBannerFrontData.TYPE_PIC;
        account.avatar = pic;
        account.idStr = jSONObject.getString("cryptoId");
        account.keyName = jSONObject.getString("cryptoKeyName");
        account.name = jSONObject.getString("accountNick");
        account.targetUrl = jSONObject.getString("targetUrl");
        account.id = "0";
        return account;
    }

    private MediaContentDetailData.Content b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaContentDetailData.Content) ipChange.ipc$dispatch("18a4750d", new Object[]{this, jSONObject});
        }
        MediaContentDetailData.Content content = new MediaContentDetailData.Content();
        content.id = jSONObject.getString("id");
        content.title = jSONObject.getString("title");
        content.summary = jSONObject.getString("title");
        JSONArray jSONArray = jSONObject.getJSONArray("elements");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject2 = (JSONObject) jSONArray.get(i);
            if (jSONObject2 != null && "video".equals(jSONObject2.getString("type"))) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("type", (Object) "VIDEO");
                jSONObject3.put("resourceStr", (Object) (StringUtils.isEmpty(jSONObject2.getString("resourceStr")) ? jSONObject2.getString("resourceStr4Detail") : jSONObject2.getString("resourceStr")));
                jSONObject3.put("duration", (Object) oec.a((Object) jSONObject2.getString("duration"), "0"));
                jSONObject3.put("firstFrameUrl", (Object) jSONObject2.getString("firstFramePicUrl"));
                jSONObject3.put("height", (Object) jSONObject2.getString("height"));
                jSONObject3.put("width", (Object) jSONObject2.getString("width"));
                jSONObject3.put("videoId", (Object) jSONObject2.getString("videoId"));
                jSONObject3.put("url", (Object) jSONObject2.getString("videoUrl"));
                arrayList.add(jSONObject3);
            }
        }
        content.elements = arrayList;
        return content;
    }

    private MediaContentDetailData.Interaction c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaContentDetailData.Interaction) ipChange.ipc$dispatch("d1d445d5", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("interact");
        JSONObject jSONObject3 = jSONObject.getJSONObject(LoginConstant.ACCOUNT);
        MediaContentDetailData.Interaction interaction = new MediaContentDetailData.Interaction();
        MediaContentDetailData.InteractionItem interactionItem = new MediaContentDetailData.InteractionItem();
        interactionItem.count = jSONObject2.getIntValue("favourCount");
        interactionItem.countFmt = jSONObject2.getString("favourCountStr");
        interactionItem.link = jSONObject2.getString("favourStatus");
        interactionItem.namespace = jSONObject2.getString("favourNamespace");
        interaction.like = interactionItem;
        MediaContentDetailData.InteractionItem interactionItem2 = new MediaContentDetailData.InteractionItem();
        interactionItem2.countFmt = "0";
        interactionItem2.count = 0;
        interactionItem2.link = "false";
        interaction.collect = interactionItem2;
        MediaContentDetailData.InteractionItem interactionItem3 = new MediaContentDetailData.InteractionItem();
        interactionItem3.count = 0;
        interactionItem3.countFmt = "0";
        interactionItem3.link = jSONObject3.getString("followed");
        interaction.follow = interactionItem3;
        MediaContentDetailData.InteractionItem interactionItem4 = new MediaContentDetailData.InteractionItem();
        interactionItem4.count = 0;
        interactionItem4.countFmt = "0";
        interactionItem4.link = "false";
        interaction.comment = interactionItem4;
        return interaction;
    }

    private JSONObject a(MediaContentDetailData mediaContentDetailData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b0c44adb", new Object[]{this, mediaContentDetailData});
        }
        JSONObject parseObject = JSON.parseObject(JSON.toJSONString(mediaContentDetailData));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("openFollowGuide", (Object) "true");
        parseObject.put("config", (Object) jSONObject);
        return parseObject;
    }
}
