package com.taobao.family;

import com.taobao.message.sp.framework.model.SimpleProfile;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class FamilyMember implements Serializable {
    public int gender;
    public int globalBubbleShowType;
    public String nickName;
    public String phoneNumber;
    public String realName;
    public Date relationConfirmTime;
    public String relationName;
    public int relationSign;
    public String remarkName;
    public int roleId;
    public String titleName;
    public String userId;

    public FamilyMember() {
    }

    public FamilyMember(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.userId = jSONObject.optString("userId");
        this.roleId = jSONObject.optInt("roleId");
        this.remarkName = jSONObject.optString("remarkName");
        this.relationName = jSONObject.optString("relationName");
        this.relationSign = jSONObject.optInt("relationSign");
        this.titleName = jSONObject.optString("titleName");
        try {
            this.relationConfirmTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(jSONObject.optString("relationConfirmTime"));
        } catch (ParseException unused) {
            this.relationConfirmTime = null;
        }
        this.globalBubbleShowType = jSONObject.optInt("globalBubbleShowType");
        this.gender = jSONObject.optInt(SimpleProfile.KEY_GENDER, 3);
    }
}
