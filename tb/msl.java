package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.taobao.mrt.e;
import com.taobao.mrt.task.desc.MRTFilesDescription;
import com.taobao.mrt.task.desc.MRTTaskDescription;
import com.taobao.mrt.task.g;
import com.taobao.mrt.utils.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class msl implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1367941206);
        kge.a(1895387482);
    }

    @Override // com.taobao.mrt.e
    public Map<String, Object> a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("49ed9a08", new Object[]{this, str, map});
        }
        if ("get_resource_path".equalsIgnoreCase(str)) {
            if (map == null || map.size() == 0) {
                a.c("ResourcePathApi", "params  is empty");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(map.get(BaseMnnRunUnit.KEY_TASK_NAME));
                String str2 = "";
                sb.append(str2);
                String sb2 = sb.toString();
                if (StringUtils.isEmpty(sb2)) {
                    a.c("ResourcePathApi", "taskName  is empty");
                    return null;
                }
                if (map.get("fileName") != null) {
                    str2 = map.get("fileName") + str2;
                }
                if (StringUtils.isEmpty(str2)) {
                    return null;
                }
                String g = g.a().g(sb2 + ".local");
                a.c("ResourcePathApi", "task " + sb2 + " localTaskName: " + g);
                if (StringUtils.isEmpty(g)) {
                    g = sb2;
                }
                MRTTaskDescription b = g.a().b(g);
                if (b == null) {
                    a.c("ResourcePathApi", "task " + g + " not register");
                    return null;
                }
                MRTFilesDescription a2 = a(b, str2);
                if (a2 == null || a2.resourceOperation == null || !(a2.resourceOperation instanceof msh)) {
                    a.c("ResourcePathApi", "task " + g + " not resource");
                    return null;
                }
                String b2 = ((msh) a2.resourceOperation).b(str2);
                if (StringUtils.isEmpty(b2)) {
                    a.c("ResourcePathApi", "task " + g + " resource :" + str2 + " not exist");
                    return null;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("filePath", b2);
                return hashMap;
            }
        }
        return null;
    }

    public static MRTFilesDescription a(MRTTaskDescription mRTTaskDescription, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRTFilesDescription) ipChange.ipc$dispatch("b320c204", new Object[]{mRTTaskDescription, str});
        }
        ArrayList<MRTFilesDescription> arrayList = new ArrayList();
        if (mRTTaskDescription.resource != null) {
            arrayList.add(mRTTaskDescription.resource);
        }
        if (mRTTaskDescription.optResource != null) {
            arrayList.add(mRTTaskDescription.optResource);
        }
        for (MRTFilesDescription mRTFilesDescription : arrayList) {
            if (mRTFilesDescription.files != null && mRTFilesDescription.files.containsKey(str)) {
                return mRTFilesDescription;
            }
        }
        return null;
    }
}
