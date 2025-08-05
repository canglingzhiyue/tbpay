package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.util.StringUtil;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public class jis {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static List<jiq> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[0]);
        }
        try {
            List<jiq> parseArray = JSON.parseArray(OrangeConfig.getInstance().getConfig("tmg_launcher", "tmg_launcher_add_task", ""), jiq.class);
            return parseArray == null ? Collections.emptyList() : parseArray;
        } catch (Exception unused) {
            return Collections.emptyList();
        }
    }

    public static List<jiq> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[0]);
        }
        try {
            List<jiq> parseArray = JSON.parseArray(OrangeConfig.getInstance().getConfig("tmg_launcher", "tmg_launcher_rm_task", ""), jiq.class);
            return parseArray == null ? Collections.emptyList() : parseArray;
        } catch (Exception unused) {
            return Collections.emptyList();
        }
    }

    public static List<String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{str});
        }
        String config = OrangeConfig.getInstance().getConfig("tmg_mini_zcache", str, "");
        if (!StringUtil.isEmpty(config)) {
            return Arrays.asList(config.split(","));
        }
        return null;
    }
}
