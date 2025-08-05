package com.taobao.android.dinamic.dinamic;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DTemplateManager;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import tb.fpa;
import tb.keq;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public c f11739a;

    static {
        kge.a(1344906325);
    }

    public e(c cVar) {
        this.f11739a = cVar;
    }

    public void a(String str, DinamicTemplate dinamicTemplate, boolean z, com.taobao.android.dinamic.view.a aVar, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6c08fbf", new Object[]{this, str, dinamicTemplate, new Boolean(z), aVar, new Double(d)});
        } else if (this.f11739a == null) {
        } else {
            StringBuilder a2 = a(dinamicTemplate);
            a(a2, "module", str);
            if (z) {
                this.f11739a.a(com.taobao.android.dinamic.e.TAG, "CreateView", a2.toString());
                this.f11739a.a(com.taobao.android.dinamic.e.TAG, "CreateView", a2.toString(), d);
                fpa.a("Dinamic_2", "Dinamic_2", a(str, "trackCreateView", dinamicTemplate, null));
                return;
            }
            String str2 = "";
            this.f11739a.a(com.taobao.android.dinamic.e.TAG, "CreateView", a2.toString(), (aVar == null || aVar.a()) ? str2 : aVar.c().keySet().toString(), aVar == null ? str2 : aVar.b());
            if (aVar != null) {
                str2 = aVar.b();
            }
            fpa.b("Dinamic_2", "Dinamic_2", a(str, "trackCreateView", dinamicTemplate, str2));
        }
    }

    private String a(String str, String str2, DinamicTemplate dinamicTemplate, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc62e4d0", new Object[]{this, str, str2, dinamicTemplate, str3});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(riy.ARRAY_START_STR);
        sb.append(str);
        sb.append("]:");
        sb.append(str2);
        sb.append("|");
        if (dinamicTemplate == null) {
            return sb.toString();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("template", (Object) dinamicTemplate.name);
        jSONObject.put("version", (Object) dinamicTemplate.version);
        if (str3 != null) {
            jSONObject.put("error", (Object) str3);
        }
        sb.append(jSONObject.toJSONString());
        return sb.toString();
    }

    public void b(String str, DinamicTemplate dinamicTemplate, boolean z, com.taobao.android.dinamic.view.a aVar, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4ccb99e", new Object[]{this, str, dinamicTemplate, new Boolean(z), aVar, new Double(d)});
        } else if (this.f11739a == null) {
        } else {
            StringBuilder a2 = a(dinamicTemplate);
            a(a2, "module", str);
            if (z) {
                this.f11739a.a(com.taobao.android.dinamic.e.TAG, "BindData", a2.toString());
                this.f11739a.a(com.taobao.android.dinamic.e.TAG, "BindData", a2.toString(), d);
                fpa.a("Dinamic_2", "Dinamic_2", a(str, "trackBindData", dinamicTemplate, null));
                return;
            }
            String str2 = "";
            this.f11739a.a(com.taobao.android.dinamic.e.TAG, "BindData", a2.toString(), (aVar == null || aVar.a()) ? str2 : aVar.c().keySet().toString(), aVar == null ? str2 : aVar.b());
            if (aVar != null) {
                str2 = aVar.b();
            }
            fpa.b("Dinamic_2", "Dinamic_2", a(str, "trackBindData", dinamicTemplate, str2));
        }
    }

    public void a(String str, String str2, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba8242", new Object[]{this, str, str2, new Double(d)});
        } else if (this.f11739a == null) {
        } else {
            StringBuilder sb = new StringBuilder();
            a(sb, "identifier", str2);
            a(sb, "module", str);
            this.f11739a.a(com.taobao.android.dinamic.e.TAG, "HandleEvent", sb.toString(), d);
        }
    }

    public void a(String str, DTemplateManager.CacheStrategy cacheStrategy, DinamicTemplate dinamicTemplate, DinamicTemplate dinamicTemplate2, double d) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bd4cbbf", new Object[]{this, str, cacheStrategy, dinamicTemplate, dinamicTemplate2, new Double(d)});
        } else if (this.f11739a == null) {
        } else {
            StringBuilder a2 = a(dinamicTemplate2);
            a(a2, "originalTemplateVersion", dinamicTemplate.version);
            a(a2, "module", str);
            a(a2, "cacheStrategy", cacheStrategy.equals(DTemplateManager.CacheStrategy.STRATEGY_DEFAULT) ? "0" : "1");
            if (dinamicTemplate2 != null) {
                if (dinamicTemplate.isPreset() && !dinamicTemplate2.isPreset()) {
                    z = false;
                }
                if (dinamicTemplate.isPreset() || dinamicTemplate.version.equals(dinamicTemplate2.version)) {
                    z2 = z;
                }
            }
            if (z2) {
                this.f11739a.a(com.taobao.android.dinamic.e.TAG, "FetchExactTemplate", a2.toString());
            } else {
                this.f11739a.a(com.taobao.android.dinamic.e.TAG, "FetchExactTemplate", a2.toString(), null, null);
            }
            this.f11739a.a(com.taobao.android.dinamic.e.TAG, "FetchExactTemplate", a2.toString(), d);
        }
    }

    public void c(String str, DinamicTemplate dinamicTemplate, boolean z, com.taobao.android.dinamic.view.a aVar, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2d8e37d", new Object[]{this, str, dinamicTemplate, new Boolean(z), aVar, new Double(d)});
        } else if (this.f11739a == null) {
        } else {
            StringBuilder a2 = a(dinamicTemplate);
            a(a2, "module", str);
            if (z) {
                this.f11739a.a(com.taobao.android.dinamic.e.TAG, "DownloadTemplate", a2.toString());
                this.f11739a.a(com.taobao.android.dinamic.e.TAG, "DownloadTemplate", a2.toString(), d);
                fpa.a("Dinamic_2", "Dinamic_2", a(str, "trackDownloadTemplate", dinamicTemplate, null));
                return;
            }
            c cVar = this.f11739a;
            String sb = a2.toString();
            String str2 = "";
            String obj = (aVar == null || aVar.a()) ? str2 : aVar.c().keySet().toString();
            if (aVar != null) {
                str2 = aVar.b();
            }
            cVar.a(com.taobao.android.dinamic.e.TAG, "DownloadTemplate", sb, obj, str2);
            fpa.b("Dinamic_2", "Dinamic_2", a(str, "trackDownloadTemplate", dinamicTemplate, keq.DOWNLOAD_ERROR));
        }
    }

    public void d(String str, DinamicTemplate dinamicTemplate, boolean z, com.taobao.android.dinamic.view.a aVar, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0e50d5c", new Object[]{this, str, dinamicTemplate, new Boolean(z), aVar, new Double(d)});
        } else if (this.f11739a == null) {
        } else {
            StringBuilder a2 = a(dinamicTemplate);
            a(a2, "module", str);
            if (z) {
                this.f11739a.a(com.taobao.android.dinamic.e.TAG, "WriteTemplate", a2.toString());
                this.f11739a.a(com.taobao.android.dinamic.e.TAG, "WriteTemplate", a2.toString(), d);
                fpa.a("Dinamic_2", "Dinamic_2", a(str, "trackWriteTemplate", dinamicTemplate, null));
                return;
            }
            c cVar = this.f11739a;
            String sb = a2.toString();
            String str2 = "";
            String obj = (aVar == null || aVar.a()) ? str2 : aVar.c().keySet().toString();
            if (aVar != null) {
                str2 = aVar.b();
            }
            cVar.a(com.taobao.android.dinamic.e.TAG, "WriteTemplate", sb, obj, str2);
            fpa.b("Dinamic_2", "Dinamic_2", a(str, "trackWriteTemplate", dinamicTemplate, "writeTemplateError"));
        }
    }

    public void e(String str, DinamicTemplate dinamicTemplate, boolean z, com.taobao.android.dinamic.view.a aVar, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef1373b", new Object[]{this, str, dinamicTemplate, new Boolean(z), aVar, new Double(d)});
        } else if (this.f11739a == null) {
        } else {
            StringBuilder a2 = a(dinamicTemplate);
            a(a2, "module", str);
            if (z) {
                this.f11739a.a(com.taobao.android.dinamic.e.TAG, "ReadTemplate", a2.toString());
                this.f11739a.a(com.taobao.android.dinamic.e.TAG, "ReadTemplate", a2.toString(), d);
                return;
            }
            c cVar = this.f11739a;
            String sb = a2.toString();
            String str2 = "";
            String obj = (aVar == null || aVar.a()) ? str2 : aVar.c().keySet().toString();
            if (aVar != null) {
                str2 = aVar.b();
            }
            cVar.a(com.taobao.android.dinamic.e.TAG, "ReadTemplate", sb, obj, str2);
        }
    }

    private StringBuilder a(DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringBuilder) ipChange.ipc$dispatch("2af9488d", new Object[]{this, dinamicTemplate});
        }
        if (dinamicTemplate == null) {
            return new StringBuilder();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("templateName=");
        sb.append(dinamicTemplate.name);
        sb.append(",templateVersion=");
        sb.append(dinamicTemplate.version);
        return sb;
    }

    private StringBuilder a(StringBuilder sb, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringBuilder) ipChange.ipc$dispatch("c5fc1372", new Object[]{this, sb, str, str2});
        }
        if (sb == null) {
            sb = new StringBuilder();
        }
        if (sb.length() > 0) {
            sb.append(",");
        }
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        return sb;
    }
}
