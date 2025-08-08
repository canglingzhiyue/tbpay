package com.taobao.avplayer.core.protocol;

import mtopsdk.common.util.StringUtils;
import com.alibaba.triver.triver_shop.newShop.ext.g;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.core.IDWObject;
import com.taobao.weex.utils.tools.TimeCalculator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes6.dex */
public class DWInteractiveVideoObject implements IDWObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public JSONObject mData;
    public JSONObject mInteractiveMap;
    public JSONObject mJsTemplates;

    static {
        kge.a(1740886840);
        kge.a(-996138287);
    }

    public DWInteractiveVideoObject(JSONObject jSONObject) throws JSONException {
        this.mData = jSONObject;
        Object opt = this.mData.opt("interactiveMap");
        if (opt == null) {
            this.mInteractiveMap = new JSONObject();
        } else {
            this.mInteractiveMap = (JSONObject) opt;
        }
        Object opt2 = this.mData.opt("type");
        Object opt3 = this.mData.opt(TimeCalculator.TIMELINE_TAG);
        if (!(opt3 instanceof JSONArray) || opt3 == null || ((JSONArray) opt3).length() <= 0) {
            return;
        }
        this.mInteractiveMap.put(opt2 == null ? "1" : opt2.toString(), opt3);
    }

    public boolean showInteractiveLogo() {
        Object opt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be25377b", new Object[]{this})).booleanValue();
        }
        Object opt2 = this.mData.opt("extendsParam");
        return (opt2 == null || (opt = ((JSONObject) opt2).opt("showColorEggIcon")) == null || !opt.toString().equals("true")) ? false : true;
    }

    public boolean showItemIcon() {
        Object opt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6ee9454", new Object[]{this})).booleanValue();
        }
        Object opt2 = this.mData.opt("extendsParam");
        return (opt2 == null || (opt = ((JSONObject) opt2).opt("showItemIcon")) == null || !opt.toString().equals("true")) ? false : true;
    }

    public String getBackCoverWXUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7091fcc5", new Object[]{this});
        }
        Object opt = this.mData.opt("extendsParam");
        if (opt == null) {
            return "";
        }
        String optString = ((JSONObject) opt).optString("backCoverUrl");
        return StringUtils.isEmpty(optString) ? "" : optString;
    }

    public JSONArray getInteractive(String str) {
        Object opt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("28f19053", new Object[]{this, str});
        }
        JSONObject jSONObject = this.mInteractiveMap;
        if (jSONObject != null && (opt = jSONObject.opt(str)) != null) {
            return (JSONArray) opt;
        }
        return null;
    }

    public JSONObject getComprehensionType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("be5f121d", new Object[]{this});
        }
        Object opt = this.mData.opt("comprehensionType");
        if (opt != null) {
            return (JSONObject) opt;
        }
        return null;
    }

    public DWInteractiveVideoObject getBegin() throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWInteractiveVideoObject) ipChange.ipc$dispatch("4651ac13", new Object[]{this});
        }
        Object opt = this.mData.opt("begin");
        if (opt != null) {
            return new DWInteractiveVideoObject((JSONObject) opt);
        }
        return null;
    }

    public DWInteractiveVideoObject getEnd() throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWInteractiveVideoObject) ipChange.ipc$dispatch("ec150321", new Object[]{this});
        }
        Object opt = this.mData.opt("end");
        if (opt != null) {
            return new DWInteractiveVideoObject((JSONObject) opt);
        }
        return null;
    }

    public JSONArray getVideoIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("58fce8d6", new Object[]{this});
        }
        Object opt = this.mData.opt("videoIdentification");
        if (opt != null) {
            return (JSONArray) opt;
        }
        return null;
    }

    public JSONObject getJsTemplates() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("135a5caf", new Object[]{this});
        }
        Object opt = this.mData.opt("jsTemplates");
        if (this.mJsTemplates == null) {
            this.mJsTemplates = opt == null ? null : (JSONObject) opt;
        }
        return this.mJsTemplates;
    }

    public JSONObject getJsTemplateUrls() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("be1b4a52", new Object[]{this});
        }
        Object opt = this.mData.opt("jsUrls");
        if (this.mJsTemplates == null) {
            this.mJsTemplates = opt == null ? null : (JSONObject) opt;
        }
        return this.mJsTemplates;
    }

    public String getJsTemplate(String str) {
        JSONObject jsTemplates;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6c81f36", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str) && str.startsWith("$") && (jsTemplates = getJsTemplates()) != null && jsTemplates.optString(str.substring(1)) != null) {
            return jsTemplates.optString(str.substring(1));
        }
        return null;
    }

    public String getJsTemplateUrl(String str) {
        JSONObject jsTemplateUrls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("199af399", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str) && str.startsWith("$") && (jsTemplateUrls = getJsTemplateUrls()) != null && jsTemplateUrls.optString(str.substring(1)) != null) {
            return jsTemplateUrls.optString(str.substring(1));
        }
        return null;
    }

    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        Object opt = this.mData.opt("id");
        if (opt != null) {
            return opt.toString();
        }
        return null;
    }

    public String getVideoId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ec0c039", new Object[]{this});
        }
        Object opt = this.mData.opt("videoId");
        if (opt != null) {
            return opt.toString();
        }
        return null;
    }

    public String getSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3139e888", new Object[]{this});
        }
        Object opt = this.mData.opt("source");
        return opt == null ? "" : opt.toString();
    }

    public String getDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e7ace2f", new Object[]{this});
        }
        Object opt = this.mData.opt("duration");
        if (opt != null) {
            return opt.toString();
        }
        return null;
    }

    public String getVideoUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9dbb94cf", new Object[]{this});
        }
        Object opt = this.mData.opt("videoUrl");
        if (opt != null) {
            return opt.toString();
        }
        return null;
    }

    public String getCoverUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5f7e00b", new Object[]{this});
        }
        Object opt = this.mData.opt("coverUrl");
        if (opt != null) {
            return opt.toString();
        }
        return null;
    }

    public String getUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        Object opt = this.mData.opt("userId");
        if (opt != null) {
            return opt.toString();
        }
        return null;
    }

    public String getUserName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d328f00d", new Object[]{this});
        }
        Object opt = this.mData.opt("userName");
        if (opt != null) {
            return opt.toString();
        }
        return null;
    }

    public String getTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
        }
        Object opt = this.mData.opt("title");
        if (opt != null) {
            return opt.toString();
        }
        return null;
    }

    public JSONObject getUtParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8606e970", new Object[]{this});
        }
        Object opt = this.mData.opt("utParams");
        if (opt != null) {
            return (JSONObject) opt;
        }
        return null;
    }

    public String getTopic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2a1d120", new Object[]{this});
        }
        Object opt = this.mData.opt("topic");
        if (opt != null) {
            return opt.toString();
        }
        return null;
    }

    public JSONArray getTimeline() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("9c895b32", new Object[]{this});
        }
        Object opt = this.mData.opt(TimeCalculator.TIMELINE_TAG);
        if (opt != null) {
            return (JSONArray) opt;
        }
        return null;
    }

    public String getEnterShopUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cbc90c42", new Object[]{this});
        }
        Object opt = this.mData.opt(g.KEY_APM_SHOP_URL);
        if (opt != null) {
            return opt.toString();
        }
        return null;
    }

    public String getShowType() {
        Object opt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d31bcc", new Object[]{this});
        }
        Object opt2 = this.mData.opt("extendsParam");
        if (opt2 != null && (opt = ((JSONObject) opt2).opt("showType")) != null) {
            return opt.toString();
        }
        return null;
    }

    public String getTaowaData() {
        Object opt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60c3e1f9", new Object[]{this});
        }
        Object opt2 = this.mData.opt("extendsParam");
        if (opt2 != null && (opt = ((JSONObject) opt2).opt("taowaData")) != null) {
            return opt.toString();
        }
        return null;
    }

    public String getShareData() {
        Object opt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ea80766", new Object[]{this});
        }
        Object opt2 = this.mData.opt("extendsParam");
        if (opt2 != null && (opt = ((JSONObject) opt2).opt("shareData")) != null) {
            return opt.toString();
        }
        return null;
    }

    public String getFavorData() {
        Object opt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41efb1e7", new Object[]{this});
        }
        Object opt2 = this.mData.opt("extendsParam");
        if (opt2 != null && (opt = ((JSONObject) opt2).opt("favorData")) != null) {
            return opt.toString();
        }
        return null;
    }
}
