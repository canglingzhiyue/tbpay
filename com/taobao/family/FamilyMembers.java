package com.taobao.family;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class FamilyMembers implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INVITE_ME = "inviteMe";
    public static final String MY_INVITE = "myInvite";
    public static final int ROLE_ID_DAUGHTER = 10;
    public static final int ROLE_ID_FATHER = 1;
    public static final int ROLE_ID_GONGGONG = 3;
    public static final int ROLE_ID_HUSBAND = 7;
    public static final int ROLE_ID_MOTHER = 2;
    public static final int ROLE_ID_POPO = 4;
    public static final int ROLE_ID_SON = 9;
    public static final int ROLE_ID_WIFE = 8;
    public static final int ROLE_ID_YUEFU = 5;
    public static final int ROLE_ID_YUEMU = 6;
    public List<FamilyMember> invitees;
    public List<FamilyMember> inviters;
    public JSONObject jsonObject;

    public FamilyMembers() {
        this.inviters = new ArrayList();
        this.invitees = new ArrayList();
        this.jsonObject = new JSONObject();
    }

    public FamilyMembers(JSONObject jSONObject) {
        this.inviters = new ArrayList();
        this.invitees = new ArrayList();
        this.jsonObject = new JSONObject();
        if (jSONObject == null) {
            return;
        }
        this.jsonObject = jSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray(INVITE_ME);
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    this.inviters.add(new FamilyMember(optJSONObject));
                }
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray(MY_INVITE);
        if (optJSONArray2 == null) {
            return;
        }
        for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
            JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2);
            if (optJSONObject2 != null) {
                this.invitees.add(new FamilyMember(optJSONObject2));
            }
        }
    }

    public List<FamilyMember> getBubbleDisplayList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("38cf4682", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (FamilyMember familyMember : this.invitees) {
            if (familyMember.globalBubbleShowType == 1) {
                arrayList.add(familyMember);
            }
        }
        for (FamilyMember familyMember2 : this.inviters) {
            if (familyMember2.globalBubbleShowType == 1) {
                arrayList.add(familyMember2);
            }
        }
        return arrayList;
    }

    public List<FamilyMember> getRelationShip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bfec5352", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (FamilyMember familyMember : this.inviters) {
            if (familyMember.roleId == 1 || familyMember.roleId == 2 || familyMember.roleId == 3 || familyMember.roleId == 4 || familyMember.roleId == 5 || familyMember.roleId == 6) {
                arrayList.add(familyMember);
            }
        }
        return arrayList;
    }

    public String getOrderString() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66a2ed0", new Object[]{this});
        }
        try {
            jSONObject = new JSONObject();
        } catch (Exception e) {
            e = e;
            jSONObject = null;
        }
        try {
            for (FamilyMember familyMember : this.inviters) {
                jSONObject.put(familyMember.userId, familyMember.remarkName);
            }
            for (FamilyMember familyMember2 : this.invitees) {
                jSONObject.put(familyMember2.userId, familyMember2.remarkName);
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            return jSONObject == null ? null : null;
        }
        if (jSONObject == null && jSONObject.length() > 0) {
            return jSONObject.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isOldPeople() {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.family.FamilyMembers.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L19
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r6
            java.lang.String r2 = "17967417"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L19:
            java.util.List<com.taobao.family.FamilyMember> r0 = r6.inviters
            java.util.Iterator r0 = r0.iterator()
        L1f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L49
            java.lang.Object r1 = r0.next()
            com.taobao.family.FamilyMember r1 = (com.taobao.family.FamilyMember) r1
            int r4 = r1.roleId
            if (r4 == r3) goto L48
            int r4 = r1.roleId
            r5 = 2
            if (r4 == r5) goto L48
            int r4 = r1.roleId
            r5 = 3
            if (r4 == r5) goto L48
            int r4 = r1.roleId
            r5 = 4
            if (r4 == r5) goto L48
            int r4 = r1.roleId
            r5 = 5
            if (r4 == r5) goto L48
            int r1 = r1.roleId
            r4 = 6
            if (r1 != r4) goto L1f
        L48:
            return r3
        L49:
            java.util.List<com.taobao.family.FamilyMember> r0 = r6.invitees
            java.util.Iterator r0 = r0.iterator()
        L4f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r0.next()
            com.taobao.family.FamilyMember r1 = (com.taobao.family.FamilyMember) r1
            int r4 = r1.roleId
            r5 = 9
            if (r4 == r5) goto L67
            int r1 = r1.roleId
            r4 = 10
            if (r1 != r4) goto L4f
        L67:
            return r3
        L68:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.family.FamilyMembers.isOldPeople():boolean");
    }
}
