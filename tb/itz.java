package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.k;
import java.util.Map;

/* loaded from: classes6.dex */
public class itz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f29317a = "NxWeexUtil";
    private imn b;

    static {
        kge.a(-2045227066);
    }

    public void a(imn imnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edf4cace", new Object[]{this, imnVar});
        } else {
            this.b = imnVar;
        }
    }

    public String a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1a4c023", new Object[]{this, map}) : b(map).toJSONString();
    }

    public JSONObject b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6501a39c", new Object[]{this, map});
        }
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        jSONObject.put(key, value);
                    }
                }
            } catch (Exception unused) {
                this.b.b().b("NxWeexUtil", "weex init data error");
            }
        }
        return jSONObject;
    }

    public void a(Map<String, TemplateBean> map, Map<String, TemplateBean> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0efabc8", new Object[]{this, map, map2});
        } else if (map2 != null && map2.size() != 0) {
            for (Map.Entry<String, TemplateBean> entry : map2.entrySet()) {
                String key = entry.getKey();
                TemplateBean value = entry.getValue();
                if (TextUtils.isEmpty(key)) {
                    this.b.b().b("NxWeexUtil", "mergeTemplates: key is empty");
                } else if (value == null) {
                    this.b.b().b("NxWeexUtil", "mergeTemplates: bean is empty");
                } else if (map.containsKey(key)) {
                    this.b.b().f("NxWeexUtil", "mergeTemplates: 模板已存在");
                } else {
                    map.put(key, value);
                }
            }
        }
    }

    public boolean a(TemplateBean templateBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d458d5e6", new Object[]{this, templateBean})).booleanValue();
        }
        if (templateBean == null) {
            this.b.b().b("NxWeexUtil", "模板为空, 请检查templateName和tItemType是不是一致的.");
            return true;
        } else if (TextUtils.isEmpty(templateBean.url)) {
            k b = this.b.b();
            b.b("NxWeexUtil", "模板url为空: " + templateBean);
            return true;
        } else if (TextUtils.isEmpty(templateBean.templateName)) {
            k b2 = this.b.b();
            b2.b("NxWeexUtil", "模板名称为空: " + templateBean);
            return true;
        } else if (TextUtils.isEmpty(templateBean.version)) {
            k b3 = this.b.b();
            b3.b("NxWeexUtil", "模板版本为空: " + templateBean);
            return true;
        } else if (!TextUtils.isEmpty(templateBean.md5)) {
            return false;
        } else {
            k b4 = this.b.b();
            b4.b("NxWeexUtil", "模板MD5为空: " + templateBean);
            return true;
        }
    }
}
