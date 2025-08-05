package com.taobao.avplayer.core.protocol;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.core.IDWObject;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kbh;
import tb.kge;

/* loaded from: classes6.dex */
public class DWTimelineObject implements IDWObject, Comparable<DWTimelineObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public JSONObject mData;
    public DWInteractiveObject mLandscapeMode;
    public DWInteractiveObject mPortraitMode;
    public String mSource;
    public HashMap<String, String> mUtParams;
    public int mStartTime = -1;
    public int mEndTime = -1;

    static {
        kge.a(-1719996736);
        kge.a(-996138287);
        kge.a(415966670);
    }

    public DWTimelineObject(JSONObject jSONObject) {
        this.mData = jSONObject;
    }

    public HashMap<String, String> getUtParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("ec99e665", new Object[]{this});
        }
        if (this.mUtParams == null) {
            this.mUtParams = new HashMap<>();
            JSONObject optJSONObject = this.mData.optJSONObject("utParams");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    this.mUtParams.put(next, optJSONObject.optString(next));
                }
            }
        }
        return this.mUtParams;
    }

    public int getIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue();
        }
        Object opt = this.mData.opt("index");
        if (opt != null) {
            return Integer.parseInt(opt.toString());
        }
        return -1;
    }

    public String getSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3139e888", new Object[]{this});
        }
        String str = this.mSource;
        if (str != null) {
            return str;
        }
        Object opt = this.mData.opt("source");
        if (opt == null) {
            return "";
        }
        this.mSource = opt.toString();
        return this.mSource;
    }

    public int getStartTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("490f0b93", new Object[]{this})).intValue();
        }
        Object opt = this.mData.opt("startTime");
        if (this.mStartTime == -1) {
            this.mStartTime = (int) (parseTime(opt == null ? null : opt.toString()) * 1000.0f);
        }
        return this.mStartTime;
    }

    public int getEndTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("250d18c", new Object[]{this})).intValue();
        }
        Object opt = this.mData.opt("endTime");
        if (this.mEndTime == -1) {
            this.mEndTime = (int) (parseTime(opt == null ? null : opt.toString()) * 1000.0f);
        }
        return this.mEndTime;
    }

    public DWInteractiveObject getPortraitMode() throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWInteractiveObject) ipChange.ipc$dispatch("d58c858b", new Object[]{this});
        }
        Object opt = this.mData.opt("portraitMode");
        if (this.mPortraitMode == null && opt != null) {
            JSONObject jSONObject = (JSONObject) opt;
            if ("item".equals(getSource())) {
                jSONObject.putOpt(Constants.Name.ALIGN, "center");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("interpolatorType", "linear");
                jSONObject2.putOpt("duration", "300");
                jSONObject2.putOpt("type", kbh.TYPE_SCALE_START);
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(jSONObject2);
                jSONObject.putOpt("startAnimations", jSONArray);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.putOpt("interpolatorType", "linear");
                jSONObject3.putOpt("duration", "300");
                jSONObject3.putOpt("type", kbh.TYPE_SCALE_END);
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(jSONObject3);
                jSONObject.putOpt("endAnimations", jSONArray2);
            }
            this.mPortraitMode = new DWInteractiveObject(jSONObject, getSource());
            this.mPortraitMode.setStartTime(getStartTime());
            this.mPortraitMode.setEndTime(getEndTime());
        }
        return this.mPortraitMode;
    }

    public DWInteractiveObject getLandscapeMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWInteractiveObject) ipChange.ipc$dispatch("70ba7d7f", new Object[]{this});
        }
        Object opt = this.mData.opt("landscapeMode");
        if (this.mLandscapeMode == null) {
            this.mLandscapeMode = opt == null ? null : new DWInteractiveObject((JSONObject) opt, getSource());
            DWInteractiveObject dWInteractiveObject = this.mLandscapeMode;
            if (dWInteractiveObject != null && dWInteractiveObject.getAnchorArray() == null) {
                this.mLandscapeMode.setAnchorArray(this.mPortraitMode.getAnchorArray());
                this.mLandscapeMode.setRenderOrientation(this.mPortraitMode.getRenderOrientation());
            }
            DWInteractiveObject dWInteractiveObject2 = this.mLandscapeMode;
            if (dWInteractiveObject2 != null) {
                dWInteractiveObject2.setStartTime(getStartTime());
                this.mLandscapeMode.setEndTime(getEndTime());
            }
        }
        return this.mLandscapeMode;
    }

    private float parseTime(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d3efb2a1", new Object[]{this, str})).floatValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        String[] split = str.split(":");
        if (split.length != 2) {
            return 0.0f;
        }
        try {
            return (Float.parseFloat(split[0]) * 60.0f) + Float.parseFloat(split[1]);
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(DWTimelineObject dWTimelineObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f7682ba9", new Object[]{this, dWTimelineObject})).intValue() : getStartTime() - dWTimelineObject.getStartTime();
    }
}
