package com.alipay.android.app.cctemplate.transport;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alipay.android.app.cctemplate.TemplateValue;
import com.alipay.android.app.cctemplate.api.TemplateService;
import com.alipay.android.app.cctemplate.model.Template;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import org.json.JSONObject;
import tb.nom;
import tb.riy;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class TemplateManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public Template getTemplateItem(String str) {
        Exception e;
        Template template;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Template) ipChange.ipc$dispatch("2613adc1", new Object[]{this, str});
        }
        LogUtils.record(2, "TemplateManager::getTemplateItem", "data=" + str);
        if (str == null) {
            return null;
        }
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, " ")) {
                JSONObject jSONObject = new JSONObject(str);
                template = new Template();
                try {
                    template.data = jSONObject.optString("data");
                    template.tag = jSONObject.optString("tag");
                    template.time = jSONObject.optString("time");
                    template.html = jSONObject.optString("html");
                    template.name = jSONObject.optString("name");
                    template.tplId = jSONObject.optString("tplId");
                    template.format = jSONObject.optString("format");
                    template.tplVersion = jSONObject.optString("tplVersion");
                    template.publishVersion = jSONObject.optString("publishVersion");
                    template.rollbackString = jSONObject.optString("rollBack");
                    template.userId = jSONObject.optString("userId");
                    template.tplUrl = jSONObject.optString("tplUrl");
                    template.tplHash = jSONObject.optString("tplHash");
                    template.expId = jSONObject.optString("expId");
                    template.expInfo = jSONObject.optJSONObject("expInfo");
                    template.expLog = jSONObject.optJSONObject("expLog");
                    template.crossTime = jSONObject.optString("crossTime");
                    template.crossVersion = jSONObject.optString("crossVersion");
                    template.requireTime = jSONObject.optString("requireTime");
                    LogUtils.record(2, "TemplateManager::getTemplateItem rollbackString userId tplVersion tplUrl", template.rollbackString + template.userId + template.tplVersion + template.tplUrl + ", " + template.requireTime);
                    return template;
                } catch (Exception e2) {
                    e = e2;
                    StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, "tpl", TemplateValue.EC_TPL_MANAGER_PARSE_FROM_JSON_EX, e);
                    return template;
                }
            }
            return null;
        } catch (Exception e3) {
            e = e3;
            template = null;
        }
    }

    public static String getTemplateVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ba17df31", new Object[0]) : TemplateService.getBirdNestVersion();
    }

    public String createBirdParamsFromTemplate(Template template) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5084097b", new Object[]{this, template});
        }
        String str = template.tplId;
        String str2 = template.tplVersion;
        String str3 = template.publishVersion;
        String str4 = template.time;
        String str5 = template.userId;
        String str6 = template.tplUrl;
        String str7 = template.tplHash;
        String str8 = template.expId;
        StringBuilder sb = new StringBuilder();
        sb.append(riy.BLOCK_START_STR);
        sb.append("\"needGray\":\"Y\",");
        sb.append("\"tplId\":\"");
        sb.append(str);
        sb.append("\",");
        sb.append("\"tplVersion\":\"");
        sb.append(str2);
        sb.append("\",");
        sb.append("\"publishVersion\":\"");
        sb.append(str3);
        sb.append("\",");
        sb.append("\"time\":\"");
        sb.append(str4);
        sb.append("\",");
        sb.append("\"tplUrl\":\"");
        sb.append(str6);
        sb.append("\",");
        sb.append("\"tplHash\":\"");
        sb.append(str7);
        sb.append("\",");
        sb.append("\"platform\":\"android\"");
        if (!TextUtils.isEmpty(str8)) {
            sb.append(",");
            sb.append("\"expId\":\"");
            sb.append(str8);
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(str5)) {
            sb.append(",");
            sb.append("\"uid\":\"");
            sb.append(str5);
            sb.append("\"");
        }
        sb.append(riy.BLOCK_END_STR);
        return sb.toString();
    }

    public static int compareVersion(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9bbef41", new Object[]{str, str2})).intValue();
        }
        if (TextUtils.equals(str, str2)) {
            return 0;
        }
        if (!TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return 1;
        }
        if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return -1;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        if (split.length != 3 || split2.length != 3) {
            return str.compareTo(str2);
        }
        for (int i = 0; i < 3; i++) {
            if (!TextUtils.equals(split[i], split2[i])) {
                return Integer.parseInt(split[i]) - Integer.parseInt(split2[i]);
            }
        }
        return 0;
    }

    public static boolean whetherNeedUpdate(Template template, Template template2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbe8d33d", new Object[]{template, template2})).booleanValue();
        }
        if (template == null) {
            return false;
        }
        String str = template.tplVersion;
        boolean z2 = compareVersion(str, getTemplateVersion()) <= 0;
        boolean z3 = compareVersion(str, "5.0.0") > 0;
        if (!z2 || !z3) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, "tpl", TemplateValue.EC_TPL_MANAGER_TPLVERSION_ILLEGAL, "remoteTplVersion is invalid:" + str);
            return false;
        } else if (template2 == null) {
            LogUtils.record(2, "TemplateManager::whetherNeedUpdate", "local template is null, need update");
            return true;
        } else {
            boolean z4 = !TextUtils.isEmpty(template.publishVersion) && TextUtils.equals(template.publishVersion, template2.publishVersion);
            int compareVersion = compareVersion(template.tplVersion, template2.tplVersion);
            boolean equals = TextUtils.equals(template.tplId, template2.tplId);
            boolean z5 = !TextUtils.isEmpty(template.expId);
            if (!z5 ? !equals || (compareVersion <= 0 && (compareVersion != 0 || (z4 && template.time != null && template.time.compareTo(template2.time) <= 0))) : (!equals || (z4 && compareVersion == 0 && template.time != null && template.time.compareTo(template2.time) == 0)) && TextUtils.equals(template2.tplHash, template.tplHash)) {
                z = false;
            }
            StringBuilder sb = new StringBuilder("模版更新:");
            sb.append(z ? nom.VALUE_YES : "NO");
            sb.append(" ");
            sb.append(template2.tplVersion);
            sb.append("#");
            sb.append(template2.time);
            sb.append(" -> ");
            sb.append(template.tplVersion);
            sb.append("#");
            sb.append(template.time);
            LogUtils.record(2, "TemplateManager::compareTemplateForUpdate", sb.toString() + "， isExpTpl=" + z5);
            StringBuilder sb2 = new StringBuilder("call compareTemplateForUpdate(...) result:");
            sb2.append(z);
            LogUtils.record(2, "TemplateManager::whetherNeedUpdate", sb2.toString());
            return z;
        }
    }

    public static boolean needRollback(Template template, Template template2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc7ae023", new Object[]{template, template2})).booleanValue();
        }
        if (template == null || template2 == null) {
            LogUtils.record(2, "TemplateManager::needRollback rollbackString:", "time version equals");
            return false;
        } else if (TextUtils.equals(template.time, template2.time) && TextUtils.equals(template.tplVersion, template2.tplVersion)) {
            LogUtils.record(2, "TemplateManager::needRollback rollbackString:", "time version equals");
            return false;
        } else if (TextUtils.isEmpty(template.rollbackString)) {
            LogUtils.record(2, "TemplateManager::needRollback rollbackString:", "isEmpty");
            return false;
        } else {
            try {
                JSONArray parseArray = JSONArray.parseArray(template.rollbackString);
                LogUtils.record(2, "TemplateManager::needRollback rollbackString:", template.rollbackString);
                int size = parseArray.size();
                for (int i = 0; i < size; i++) {
                    com.alibaba.fastjson.JSONObject jSONObject = parseArray.getJSONObject(i);
                    String string = jSONObject.getString("tplVersion");
                    String string2 = jSONObject.getString("time");
                    if (TextUtils.equals(string, template2.tplVersion) && TextUtils.equals(string2, template2.time)) {
                        LogUtils.record(2, "TemplateManager::needRollback:", string + " " + string2 + " false");
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        }
    }
}
