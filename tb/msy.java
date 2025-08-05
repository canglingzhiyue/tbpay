package tb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.util.Pair;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.agoo.TaobaoConstants;
import com.taobao.tao.log.TLog;
import org.android.agoo.common.AgooConstants;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class msy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1349564574);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(37:26|(2:27|28)|29|(1:31)(1:139)|32|33|34|35|(1:37)|38|(1:40)|41|42|44|45|(1:47)|49|50|51|52|53|54|55|56|57|58|59|60|(7:62|63|(1:123)(12:67|(2:121|122)(1:69)|70|(1:72)|73|(1:75)(1:120)|76|(1:78)|79|(1:81)(1:119)|82|(1:115)(5:90|91|(1:114)(1:97)|(2:99|(1:103))(1:113)|112))|104|105|106|107)|125|63|(1:65)|123|104|105|106|107) */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02be, code lost:
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.taobao.msgnotification.mode.MsgNotficationDTO a(android.content.Intent r32) {
        /*
            Method dump skipped, instructions count: 723
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.msy.a(android.content.Intent):com.taobao.msgnotification.mode.MsgNotficationDTO");
    }

    public static Bundle b(Intent intent) {
        Bundle bundle;
        String stringExtra;
        String stringExtra2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("7c08dfea", new Object[]{intent});
        }
        if (intent == null) {
            return null;
        }
        try {
            stringExtra = intent.getStringExtra("id");
        } catch (Throwable th) {
            th = th;
            bundle = null;
        }
        if (TextUtils.isEmpty(stringExtra)) {
            return null;
        }
        bundle = new Bundle();
        try {
            Pair<String, Integer> d = d(intent);
            if (d != null) {
                if (!TextUtils.isEmpty(d.first)) {
                    bundle.putString("category", d.first);
                }
                if (d.second != null) {
                    bundle.putInt("importance", d.second.intValue());
                }
            }
            bundle.putString("id", stringExtra);
            stringExtra2 = intent.getStringExtra(AgooConstants.MESSAGE_BODY);
            String stringExtra3 = intent.getStringExtra("task_id");
            if (!TextUtils.isEmpty(stringExtra3)) {
                bundle.putString("task_id", stringExtra3);
            }
        } catch (Throwable th2) {
            th = th2;
            TLog.loge("agoo_push", Log.getStackTraceString(th));
            return bundle;
        }
        if (TextUtils.isEmpty(stringExtra2)) {
            return null;
        }
        bundle.putString(AgooConstants.MESSAGE_BODY, stringExtra2);
        JSONObject jSONObject = new JSONObject(stringExtra2);
        String string = jSONObject.getString("url");
        if (!TextUtils.isEmpty(string)) {
            bundle.putString(TaobaoConstants.MESSAGE_URL, string);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(Constants.KEY_EXTS);
        if (optJSONObject != null) {
            String string2 = optJSONObject.getString("messageId");
            if (!TextUtils.isEmpty(string2)) {
                bundle.putString("messageId", string2);
            }
        }
        return bundle;
    }

    public static boolean c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2aa3052b", new Object[]{intent})).booleanValue();
        }
        try {
            return com.alibaba.fastjson.JSONObject.parseObject(intent.getStringExtra(AgooConstants.MESSAGE_EXT)).getJSONObject("notifPop").getInteger("enable").intValue() == 1;
        } catch (Throwable unused) {
            return true;
        }
    }

    public static Pair<String, Integer> d(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("1738d9a7", new Object[]{intent});
        }
        try {
            com.alibaba.fastjson.JSONObject jSONObject = com.alibaba.fastjson.JSONObject.parseObject(intent.getStringExtra(AgooConstants.MESSAGE_EXT)).getJSONObject("notifPop").getJSONObject("classif");
            return Pair.create(a(jSONObject.getString("cat")), b(jSONObject.getString("imp")));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009a, code lost:
        if (r5.equals("CATEGORY_CALL") != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String a(java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.msy.a(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static Integer b(String str) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("78142dda", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        switch (str.hashCode()) {
            case -256003955:
                if (str.equals("IMPORTANCE_HIGH")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -255819229:
                if (str.equals("IMPORTANCE_NONE")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1515766505:
                if (str.equals("IMPORTANCE_LOW")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1515767033:
                if (str.equals("IMPORTANCE_MAX")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1515767271:
                if (str.equals("IMPORTANCE_MIN")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1877482326:
                if (str.equals("IMPORTANCE_DEFAULT")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1985295820:
                if (str.equals("IMPORTANCE_UNSPECIFIED")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return -1000;
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                return null;
        }
    }
}
