package com.taobao.tao.util;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.b;
import com.taobao.share.globalmodel.e;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.statistic.TBS;
import com.taobao.tao.friends.model.ContactType;
import com.taobao.tao.friends.model.a;
import com.taobao.taolive.room.utils.ag;
import com.ut.share.business.ShareTargetType;
import java.net.URLEncoder;
import java.util.List;
import java.util.Properties;
import org.android.agoo.common.AgooConstants;
import tb.kge;
import tb.nyl;
import tb.oig;
import tb.oim;

/* loaded from: classes8.dex */
public class AnalyticsUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1396382395);
    }

    public static void contactShowEvent(List<b> list, TBShareContent tBShareContent, String str, String str2) {
        a aVar;
        com.taobao.tao.friends.model.b i;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e8df14c", new Object[]{list, tBShareContent, str, str2});
            return;
        }
        StringBuilder sb = new StringBuilder();
        String str4 = null;
        String str5 = null;
        String str6 = null;
        for (b bVar : list) {
            if ((bVar instanceof a) && (i = (aVar = (a) bVar).i()) != null) {
                str4 = aVar.e();
                str5 = aVar.f();
                str6 = aVar.d();
                if (aVar.g() != null) {
                    String userId = aVar.g().getUserId();
                    if (TextUtils.isEmpty(userId)) {
                        userId = aVar.g().getCcode();
                    }
                    sb.append(userId);
                    sb.append("^");
                }
                if (i.c == ContactType.LINK && !TextUtils.isEmpty(aVar.h()) && AgooConstants.ACK_PACK_NOBIND.equals(i.d)) {
                    TBS.Ext.commitEvent("Page_Share", 19999, "Page_Detail_creatgroup_expose", (Object) null, (Object) null);
                }
                if (tBShareContent != null) {
                    String contactShowEventName = UTAnalyticsHelper.getContactShowEventName(aVar);
                    if (aVar.g() != null) {
                        String userId2 = aVar.g().getUserId();
                        str3 = TextUtils.isEmpty(userId2) ? aVar.g().getCcode() : userId2;
                    } else {
                        str3 = null;
                    }
                    TBS.Ext.commitEvent("Page_Share", 19999, contactShowEventName, tBShareContent.businessId, str3, str2);
                }
            }
        }
        if (tBShareContent == null) {
            return;
        }
        String a2 = ShareBizAdapter.getInstance().getLogin().a();
        String str7 = tBShareContent.businessId;
        String[] strArr = new String[1];
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tBShareContent.businessId);
        sb2.append(",");
        sb2.append(a2 != null);
        sb2.append(",");
        sb2.append(a2);
        strArr[0] = sb2.toString();
        TBS.Ext.commitEvent("Page_Share", 19999, "ContactsShow", str7, null, strArr);
        String str8 = tBShareContent.url;
        if ("detail".equals(tBShareContent.templateId)) {
            str8 = e.b().f();
        } else if ("shop".equals(tBShareContent.templateId)) {
            try {
                str8 = tBShareContent.url.split(".")[0].split("shop")[1];
            } catch (Throwable unused) {
            }
        }
        String sb3 = sb.toString();
        if (sb3.endsWith("^")) {
            sb3 = sb3.substring(0, sb3.length() - 1);
        }
        TBS.Ext.commitEvent("Page_Share", 19999, "Page_Share_Friends_expose", tBShareContent.businessId, null, "shareTraceId=" + str6 + ",userId=" + a2 + ",recommendUserIds=" + sb3 + ",timeStamp=" + System.currentTimeMillis() + ",shareContent=" + str8 + ",templateId=" + tBShareContent.templateId + ",pvid=" + str4 + "," + ag.ARG_SCM + str5);
    }

    public static void traceWXAndQQShare(b bVar, String str, boolean z, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bd3d26", new Object[]{bVar, str, new Boolean(z), str2});
            return;
        }
        oig.a a2 = oig.a(bVar.b());
        String b = bVar.b();
        TBShareContent a3 = bVar.a().a();
        String str4 = "";
        String str5 = a2 != null ? a2.b : str4;
        if (a2 != null) {
            str4 = a2.c;
        }
        if (TextUtils.isEmpty(b) || e.b().j() == null) {
            return;
        }
        String str6 = a3.businessId;
        if (z) {
            str3 = "withPic=1&PicUrl=" + a3.imageUrl + "&passwordKey=" + str2;
        } else {
            str3 = "withPic=0&PicUrl=" + a3.imageUrl + "&passwordKey=" + str2;
        }
        String str7 = str3 + "&" + a3.originUTArgs();
        if (!TextUtils.isEmpty(str6)) {
            TBS.Ext.commitEvent("Page_Extend", 5002, str6, str5, str, str7);
        }
        Properties properties = new Properties();
        if (!TextUtils.isEmpty(str4)) {
            properties.put("Type", str4);
        }
        if (!TextUtils.isEmpty(str6)) {
            properties.put("bizID", str6);
        }
        a3.fillUTProperties(properties);
        TBS.Ext.commitEvent("ShareTypes", properties);
    }

    public static void wxAndQQOnClick(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d25a4973", new Object[]{bVar});
        } else if (nyl.a()) {
        } else {
            oig.a a2 = oig.a(bVar.b());
            TBShareContent a3 = bVar.a().a();
            if (TextUtils.isEmpty(bVar.b()) || e.b().j() == null) {
                return;
            }
            String str = a3.businessId;
            if (!TextUtils.isEmpty(str)) {
                TBS.Ext.commitEvent(5002, str, a2.b, a3.url, a3.originUTArgs());
            }
            Properties properties = new Properties();
            if (!TextUtils.isEmpty(a2.c)) {
                properties.put("Type", a2.c);
            }
            if (!TextUtils.isEmpty(str)) {
                properties.put("bizID", str);
            }
            a3.fillUTProperties(properties);
            TBS.Ext.commitEvent("ShareTypes", properties);
        }
    }

    public static void traceShowShareView(TBShareContent tBShareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d098624", new Object[]{tBShareContent});
        } else {
            TBS.Ext.commitEventEnd("ShareLoadTime", null);
        }
    }

    public static void tracePopupEvent(TBShareContent tBShareContent, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26a447f1", new Object[]{tBShareContent, new Long(j)});
        } else if (tBShareContent == null) {
        } else {
            String str = "";
            String str2 = tBShareContent != null ? tBShareContent.businessId : str;
            String str3 = tBShareContent.detailSharePosition;
            TBS.Ext.commitEvent("Page_Share", 19999, "Popup", str2, str3, tBShareContent.businessId + "," + tBShareContent.templateId + "," + j + "," + ShareBizAdapter.getInstance().getLogin().a() + "," + e.b().m() + ",suId=" + tBShareContent.suId);
            StringBuilder sb = new StringBuilder();
            sb.append(tBShareContent.businessId);
            sb.append(",");
            sb.append(tBShareContent.templateId);
            sb.append(",");
            sb.append(j);
            String sb2 = sb.toString();
            if (tBShareContent != null) {
                str = tBShareContent.businessId;
            }
            TBS.Ext.commitEvent("UT", 19999, "Page_Share-Popup", str, tBShareContent.detailSharePosition, sb2);
        }
    }

    public static void traceViewClickOthers(b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3071eeb", new Object[]{bVar, str});
            return;
        }
        TBShareContent j = e.b().j();
        if (j == null || ShareTargetType.Share2Contact.getValue().equals(bVar.b())) {
            return;
        }
        String str2 = j.businessId;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        oig.a a2 = oig.a(bVar.b());
        if (a2 == null) {
            a2 = new oig.a(new oim(), bVar.b(), bVar.b());
        }
        if (a2 == null) {
            return;
        }
        String str3 = "withPic=0";
        if (TextUtils.equals(ShareTargetType.Share2Copy.getValue(), bVar.b())) {
            String g = ShareBizAdapter.getInstance().getAppEnv().g();
            try {
                str3 = str3 + "&passwordKey=" + URLEncoder.encode(g, "UTF-8");
            } catch (Throwable unused) {
            }
        }
        String str4 = str3 + "&" + j.originUTArgs();
        if (str != null) {
            TBS.Ext.commitEvent("Page_Extend", 5002, str2, a2.b, str, str4);
        } else {
            TBS.Ext.commitEvent("Page_Extend", 5002, str2, a2.b, j.url, str4);
        }
    }

    public static void traceChannelSelect(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6250e25a", new Object[]{bVar});
            return;
        }
        TBShareContent j = e.b().j();
        if (j == null || bVar == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(j.businessId);
        sb.append(",");
        sb.append(j.templateId);
        sb.append(",");
        sb.append(ShareBizAdapter.getInstance().getLogin().a());
        sb.append(",");
        sb.append(bVar != null ? bVar.b() : null);
        sb.append(",");
        sb.append(true);
        sb.append(",suId=");
        sb.append(j.suId);
        TBS.Ext.commitEvent("Page_Share", 19999, "ChannelSelect", j != null ? j.businessId : "", j.detailSharePosition, sb.toString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (r4.equals("copy") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getPlatformByTag(java.lang.String r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.util.AnalyticsUtil.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r4
            java.lang.String r4 = "e6326195"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L15:
            r0 = -1
            int r1 = r4.hashCode()
            switch(r1) {
                case -1414960566: goto L5d;
                case -904024897: goto L52;
                case 3616: goto L47;
                case 114009: goto L3c;
                case 3059573: goto L33;
                case 113011944: goto L28;
                case 133862058: goto L1e;
                default: goto L1d;
            }
        L1d:
            goto L67
        L1e:
            java.lang.String r1 = "dingtalk"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L67
            r2 = 5
            goto L68
        L28:
            java.lang.String r1 = "weibo"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L67
            r2 = 3
            goto L68
        L33:
            java.lang.String r1 = "copy"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L67
            goto L68
        L3c:
            java.lang.String r1 = "sms"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L67
            r2 = 4
            goto L68
        L47:
            java.lang.String r1 = "qq"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L67
            r2 = 2
            goto L68
        L52:
            java.lang.String r1 = "wxfriend"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L67
            r2 = 1
            goto L68
        L5d:
            java.lang.String r1 = "alipay"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L67
            r2 = 6
            goto L68
        L67:
            r2 = -1
        L68:
            switch(r2) {
                case 0: goto L80;
                case 1: goto L7d;
                case 2: goto L7a;
                case 3: goto L77;
                case 4: goto L74;
                case 5: goto L71;
                case 6: goto L6e;
                default: goto L6b;
            }
        L6b:
            java.lang.String r4 = "Other"
            return r4
        L6e:
            java.lang.String r4 = "AliPay"
            return r4
        L71:
            java.lang.String r4 = "DingTalk"
            return r4
        L74:
            java.lang.String r4 = "SMS"
            return r4
        L77:
            java.lang.String r4 = "SinaWeibo"
            return r4
        L7a:
            java.lang.String r4 = "TaoPassword-QQ"
            return r4
        L7d:
            java.lang.String r4 = "TaoPassword-WeiXin"
            return r4
        L80:
            java.lang.String r4 = "Copy"
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.util.AnalyticsUtil.getPlatformByTag(java.lang.String):java.lang.String");
    }
}
