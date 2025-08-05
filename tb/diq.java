package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class diq implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static diq c;

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, Map<String, String>> f26789a = new ConcurrentHashMap<>();
    private String b;

    static {
        kge.a(-806202140);
        kge.a(-1209827241);
        c = null;
    }

    public static diq a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (diq) ipChange.ipc$dispatch("f03b212", new Object[0]);
        }
        if (c == null) {
            synchronized (diq.class) {
                if (c == null) {
                    c = new diq();
                }
            }
        }
        return c;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        if (!this.f26789a.containsKey(str)) {
            Map<String, String> d = d(str);
            this.f26789a.put(str, d);
            c(str);
            OrangeConfig.getInstance().getConfig(str, str2, "");
            return d.get(str2);
        }
        Map<String, String> map = this.f26789a.get(str);
        if (map == null) {
            return null;
        }
        return map.get(str2);
    }

    private diq() {
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        return this.b + "/cached_config_0_" + str;
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{str}, this, false);
        }
    }

    private boolean a(String str, Map<String, String> map) {
        FileWriter fileWriter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20476517", new Object[]{this, str, map})).booleanValue();
        }
        File file = new File(b(str));
        if (file.exists()) {
            file.delete();
        }
        if (map == null) {
            map = new HashMap<>();
        }
        String jSONString = JSON.toJSONString(map);
        FileWriter fileWriter2 = null;
        try {
            fileWriter = new FileWriter(new File(b(str)));
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileWriter.write(jSONString);
            fileWriter.flush();
            try {
                fileWriter.close();
            } catch (IOException unused2) {
            }
            return true;
        } catch (Exception unused3) {
            fileWriter2 = fileWriter;
            if (fileWriter2 != null) {
                try {
                    fileWriter2.close();
                } catch (IOException unused4) {
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileWriter2 = fileWriter;
            if (fileWriter2 != null) {
                try {
                    fileWriter2.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }

    private Map<String, String> d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fa35996a", new Object[]{this, str});
        }
        File file = new File(b(str));
        if (!file.exists()) {
            return new HashMap();
        }
        BufferedReader bufferedReader = null;
        try {
            try {
                StringBuilder sb = new StringBuilder();
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    } catch (Exception unused) {
                        bufferedReader = bufferedReader2;
                        HashMap hashMap = new HashMap();
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused2) {
                            }
                        }
                        return hashMap;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                }
                Map<String, String> map = (Map) JSONObject.parse(sb.toString());
                if (map != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused4) {
                    }
                    return map;
                }
                try {
                    bufferedReader2.close();
                } catch (IOException unused5) {
                }
                return new HashMap();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused6) {
        }
    }

    @Override // com.taobao.orange.d
    public void onConfigUpdate(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            return;
        }
        try {
            a(str, OrangeConfig.getInstance().getConfigs(str));
        } catch (Throwable unused) {
        }
    }
}
