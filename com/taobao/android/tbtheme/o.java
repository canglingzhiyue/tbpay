package com.taobao.android.tbtheme;

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

/* loaded from: classes6.dex */
public class o implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f15445a;
    private final ConcurrentHashMap<String, Map<String, String>> b = new ConcurrentHashMap<>();

    public o(String str) {
        this.f15445a = str;
    }

    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        if (!this.b.containsKey(str)) {
            Map<String, String> c = c(str);
            this.b.put(str, c);
            b(str);
            OrangeConfig.getInstance().getConfig(str, str2, "");
            return c.get(str2);
        }
        Map<String, String> map = this.b.get(str);
        if (map == null) {
            return null;
        }
        return map.get(str2);
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        return this.f15445a + "/cached_config_" + str;
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
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
        File file = new File(a(str));
        if (file.exists()) {
            file.delete();
        }
        if (map == null) {
            map = new HashMap<>();
        }
        String jSONString = JSON.toJSONString(map);
        FileWriter fileWriter2 = null;
        try {
            fileWriter = new FileWriter(new File(a(str)));
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

    private Map<String, String> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e68dc5e9", new Object[]{this, str});
        }
        File file = new File(a(str));
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
                HashMap hashMap2 = new HashMap();
                try {
                    bufferedReader2.close();
                } catch (IOException unused5) {
                }
                return hashMap2;
            } catch (Exception unused6) {
            }
        } catch (Throwable th2) {
            th = th2;
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
