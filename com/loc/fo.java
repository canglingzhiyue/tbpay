package com.loc;

import android.content.Context;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.amap.api.location.AMapLocationClientOption;
import com.taobao.media.MediaConstant;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class fo {

    /* renamed from: a  reason: collision with root package name */
    private StringBuilder f7798a = new StringBuilder();
    private AMapLocationClientOption b = new AMapLocationClientOption();

    private void a(ew ewVar, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        StringBuilder sb = new StringBuilder();
        if (!StringUtils.isEmpty(str)) {
            sb.append(str);
            sb.append(" ");
        }
        if (!StringUtils.isEmpty(str2)) {
            a(str, str2, sb);
        }
        if (!StringUtils.isEmpty(str3)) {
            sb.append(str3);
            sb.append(" ");
        }
        if (!StringUtils.isEmpty(str4)) {
            sb.append(str4);
            sb.append(" ");
        }
        if (!StringUtils.isEmpty(str5)) {
            sb.append(str5);
            sb.append(" ");
        }
        if (!StringUtils.isEmpty(str6)) {
            a(str7, str6, sb, ewVar);
        }
        Bundle bundle = new Bundle();
        bundle.putString("citycode", ewVar.getCityCode());
        bundle.putString("desc", sb.toString());
        bundle.putString("adcode", ewVar.getAdCode());
        ewVar.setExtras(bundle);
        ewVar.g(sb.toString());
        String adCode = ewVar.getAdCode();
        ewVar.setAddress((adCode == null || adCode.trim().length() <= 0 || this.b.getGeoLanguage() == AMapLocationClientOption.GeoLanguage.EN) ? sb.toString() : sb.toString().replace(" ", ""));
    }

    private static void a(ew ewVar, short s) {
        if ("-1".equals(ewVar.d())) {
            if (s == 101) {
                s = 100;
            }
            ewVar.setConScenario(s);
            return;
        }
        if (s == -1) {
            s = 0;
        } else if (s == 0) {
            s = -1;
        }
        ewVar.setConScenario(s);
    }

    private void a(String str, String str2, StringBuilder sb) {
        if (this.b.getGeoLanguage() == AMapLocationClientOption.GeoLanguage.EN) {
            if (str2.equals(str)) {
                return;
            }
            sb.append(str2);
            sb.append(" ");
        } else if (str.contains("市") && str.equals(str2)) {
        } else {
            sb.append(str2);
            sb.append(" ");
        }
    }

    private void a(String str, String str2, StringBuilder sb, ew ewVar) {
        String concat;
        if (StringUtils.isEmpty(str) || this.b.getGeoLanguage() == AMapLocationClientOption.GeoLanguage.EN) {
            sb.append("Near ".concat(String.valueOf(str2)));
            concat = "Near ".concat(String.valueOf(str2));
        } else {
            sb.append("靠近");
            sb.append(str2);
            sb.append(" ");
            concat = "在" + str2 + "附近";
        }
        ewVar.setDescription(concat);
    }

    private static String b(String str) {
        return MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264.equals(str) ? "" : str;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public final com.loc.ew a(com.loc.ew r22, byte[] r23, com.loc.eq r24) {
        /*
            Method dump skipped, instructions count: 711
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.fo.a(com.loc.ew, byte[], com.loc.eq):com.loc.ew");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0075, code lost:
        if (r3.length() <= 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0077, code lost:
        r10.setCity(r3);
        r2 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083 A[Catch: Throwable -> 0x010b, TryCatch #0 {Throwable -> 0x010b, blocks: (B:3:0x0001, B:5:0x004e, B:7:0x0056, B:9:0x005e, B:12:0x0067, B:18:0x007d, B:20:0x0083, B:22:0x0089, B:25:0x00d7, B:27:0x00e9, B:29:0x00f5, B:30:0x0104, B:14:0x0071, B:16:0x0077), top: B:33:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d7 A[Catch: Throwable -> 0x010b, TRY_ENTER, TryCatch #0 {Throwable -> 0x010b, blocks: (B:3:0x0001, B:5:0x004e, B:7:0x0056, B:9:0x005e, B:12:0x0067, B:18:0x007d, B:20:0x0083, B:22:0x0089, B:25:0x00d7, B:27:0x00e9, B:29:0x00f5, B:30:0x0104, B:14:0x0071, B:16:0x0077), top: B:33:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f5 A[Catch: Throwable -> 0x010b, TryCatch #0 {Throwable -> 0x010b, blocks: (B:3:0x0001, B:5:0x004e, B:7:0x0056, B:9:0x005e, B:12:0x0067, B:18:0x007d, B:20:0x0083, B:22:0x0089, B:25:0x00d7, B:27:0x00e9, B:29:0x00f5, B:30:0x0104, B:14:0x0071, B:16:0x0077), top: B:33:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.loc.ew a(java.lang.String r14) {
        /*
            r13 = this;
            r0 = 0
            com.loc.ew r10 = new com.loc.ew     // Catch: java.lang.Throwable -> L10b
            java.lang.String r1 = ""
            r10.<init>(r1)     // Catch: java.lang.Throwable -> L10b
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L10b
            r1.<init>(r14)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r14 = "regeocode"
            org.json.JSONObject r14 = r1.optJSONObject(r14)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r1 = "addressComponent"
            org.json.JSONObject r1 = r14.optJSONObject(r1)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r2 = "country"
            java.lang.String r2 = r1.optString(r2)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r2 = b(r2)     // Catch: java.lang.Throwable -> L10b
            r10.setCountry(r2)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r2 = "province"
            java.lang.String r2 = r1.optString(r2)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r3 = b(r2)     // Catch: java.lang.Throwable -> L10b
            r10.setProvince(r3)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r2 = "citycode"
            java.lang.String r2 = r1.optString(r2)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r2 = b(r2)     // Catch: java.lang.Throwable -> L10b
            r10.setCityCode(r2)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r4 = "city"
            java.lang.String r4 = r1.optString(r4)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r5 = "010"
            boolean r5 = r2.endsWith(r5)     // Catch: java.lang.Throwable -> L10b
            if (r5 != 0) goto L6f
            java.lang.String r5 = "021"
            boolean r5 = r2.endsWith(r5)     // Catch: java.lang.Throwable -> L10b
            if (r5 != 0) goto L6f
            java.lang.String r5 = "022"
            boolean r5 = r2.endsWith(r5)     // Catch: java.lang.Throwable -> L10b
            if (r5 != 0) goto L6f
            java.lang.String r5 = "023"
            boolean r2 = r2.endsWith(r5)     // Catch: java.lang.Throwable -> L10b
            if (r2 == 0) goto L67
            goto L6f
        L67:
            java.lang.String r2 = b(r4)     // Catch: java.lang.Throwable -> L10b
            r10.setCity(r2)     // Catch: java.lang.Throwable -> L10b
            goto L7d
        L6f:
            if (r3 == 0) goto L7c
            int r2 = r3.length()     // Catch: java.lang.Throwable -> L10b
            if (r2 <= 0) goto L7c
            r10.setCity(r3)     // Catch: java.lang.Throwable -> L10b
            r2 = r3
            goto L7d
        L7c:
            r2 = r4
        L7d:
            boolean r4 = android.text.StringUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L10b
            if (r4 == 0) goto L88
            r10.setCity(r3)     // Catch: java.lang.Throwable -> L10b
            r4 = r3
            goto L89
        L88:
            r4 = r2
        L89:
            java.lang.String r2 = "district"
            java.lang.String r2 = r1.optString(r2)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r5 = b(r2)     // Catch: java.lang.Throwable -> L10b
            r10.setDistrict(r5)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r2 = "adcode"
            java.lang.String r2 = r1.optString(r2)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r9 = b(r2)     // Catch: java.lang.Throwable -> L10b
            r10.setAdCode(r9)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r2 = "streetNumber"
            org.json.JSONObject r1 = r1.optJSONObject(r2)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r2 = "street"
            java.lang.String r2 = r1.optString(r2)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r6 = b(r2)     // Catch: java.lang.Throwable -> L10b
            r10.setStreet(r6)     // Catch: java.lang.Throwable -> L10b
            r10.setRoad(r6)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r2 = "number"
            java.lang.String r1 = r1.optString(r2)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r7 = b(r1)     // Catch: java.lang.Throwable -> L10b
            r10.setNumber(r7)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r1 = "pois"
            org.json.JSONArray r1 = r14.optJSONArray(r1)     // Catch: java.lang.Throwable -> L10b
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L10b
            java.lang.String r8 = "name"
            r11 = 0
            if (r2 <= 0) goto Le8
            org.json.JSONObject r1 = r1.getJSONObject(r11)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r1 = r1.optString(r8)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r1 = b(r1)     // Catch: java.lang.Throwable -> L10b
            r10.setPoiName(r1)     // Catch: java.lang.Throwable -> L10b
            r12 = r1
            goto Le9
        Le8:
            r12 = r0
        Le9:
            java.lang.String r1 = "aois"
            org.json.JSONArray r14 = r14.optJSONArray(r1)     // Catch: java.lang.Throwable -> L10b
            int r1 = r14.length()     // Catch: java.lang.Throwable -> L10b
            if (r1 <= 0) goto L104
            org.json.JSONObject r14 = r14.getJSONObject(r11)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r14 = r14.optString(r8)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r14 = b(r14)     // Catch: java.lang.Throwable -> L10b
            r10.setAoiName(r14)     // Catch: java.lang.Throwable -> L10b
        L104:
            r1 = r13
            r2 = r10
            r8 = r12
            r1.a(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L10b
            return r10
        L10b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.fo.a(java.lang.String):com.loc.ew");
    }

    public final ew a(String str, Context context, bu buVar, eq eqVar) {
        ew ewVar = new ew("");
        ewVar.setErrorCode(7);
        StringBuffer stringBuffer = new StringBuffer();
        try {
            stringBuffer.append("#SHA1AndPackage#");
            stringBuffer.append(l.e(context));
            String str2 = buVar.b.get("gsid").get(0);
            if (!StringUtils.isEmpty(str2)) {
                stringBuffer.append("#gsid#");
                stringBuffer.append(str2);
            }
            String str3 = buVar.c;
            if (!StringUtils.isEmpty(str3)) {
                stringBuffer.append("#csid#".concat(String.valueOf(str3)));
            }
        } catch (Throwable unused) {
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("status") || !jSONObject.has("info")) {
                eqVar.f("#0702");
                StringBuilder sb = this.f7798a;
                sb.append("json is error:");
                sb.append(str);
                sb.append(stringBuffer);
                sb.append("#0702");
            }
            String string = jSONObject.getString("status");
            String string2 = jSONObject.getString("info");
            String string3 = jSONObject.getString("infocode");
            if ("0".equals(string)) {
                eqVar.f("#0701");
                StringBuilder sb2 = this.f7798a;
                sb2.append("auth fail:");
                sb2.append(string2);
                sb2.append(stringBuffer);
                sb2.append("#0701");
                fw.a(buVar.d, string3, string2);
            }
        } catch (Throwable th) {
            eqVar.f("#0703");
            StringBuilder sb3 = this.f7798a;
            sb3.append("json exception error:");
            sb3.append(th.getMessage());
            sb3.append(stringBuffer);
            sb3.append("#0703");
            fr.a(th, "parser", "paseAuthFailurJson");
        }
        ewVar.setLocationDetail(this.f7798a.toString());
        if (this.f7798a.length() > 0) {
            StringBuilder sb4 = this.f7798a;
            sb4.delete(0, sb4.length());
        }
        return ewVar;
    }

    public final void a(AMapLocationClientOption aMapLocationClientOption) {
        if (aMapLocationClientOption == null) {
            this.b = new AMapLocationClientOption();
        } else {
            this.b = aMapLocationClientOption;
        }
    }
}
