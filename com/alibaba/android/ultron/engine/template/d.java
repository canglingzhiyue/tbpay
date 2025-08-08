package com.alibaba.android.ultron.engine.template;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.alibaba.android.ultron.engine.a;
import com.alibaba.android.ultron.engine.model.Template;
import com.alibaba.android.ultron.engine.utils.ErrorConstants;
import com.alibaba.android.ultron.engine.utils.g;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.alivfssdk.cache.h;
import com.taobao.android.task.Coordinator;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.nio.charset.Charset;
import java.util.HashMap;
import mtopsdk.network.impl.ResponseProtocolType;
import tb.bga;
import tb.bjq;
import tb.bjr;
import tb.bjs;
import tb.bpd;
import tb.bpg;
import tb.jpr;
import tb.jpu;
import tb.kge;

/* loaded from: classes2.dex */
public class d implements com.alibaba.android.ultron.engine.template.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static HashMap<String, a> i;
    private static String j;
    private static String k;
    private static String l;
    private static String m;
    private static String n;
    private static String o;

    /* renamed from: a  reason: collision with root package name */
    public boolean f2570a = false;
    public boolean b = false;
    public bjq c;
    public bjs d;
    public bjr e;
    public com.alibaba.android.ultron.vfw.instance.d f;
    public Context g;
    public String h;

    public static /* synthetic */ String a(d dVar, TemplateInfo templateInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f5ccf79e", new Object[]{dVar, templateInfo}) : dVar.b(templateInfo);
    }

    public static /* synthetic */ JSONObject b(d dVar, TemplateInfo templateInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("b1fe41c1", new Object[]{dVar, templateInfo}) : dVar.f(templateInfo);
    }

    static {
        kge.a(-491821519);
        kge.a(-2000823924);
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        i = new HashMap<>();
    }

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public bjq f2572a;
        public JSONObject b;

        static {
            kge.a(1549753379);
        }

        private a() {
        }
    }

    public d(Context context, String str) {
        this.g = context;
        this.h = str;
    }

    public d(com.alibaba.android.ultron.vfw.instance.d dVar, Context context, String str) {
        this.f = dVar;
        this.g = context;
        this.h = str;
    }

    private String a(Template template) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4871813c", new Object[]{this, template});
        }
        return template.templateId + "_" + template.version;
    }

    private String b(TemplateInfo templateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c271c252", new Object[]{this, templateInfo});
        }
        if (templateInfo.getTemplateId() == null) {
            return null;
        }
        return templateInfo.getTemplateId() + "_" + templateInfo.getVersion();
    }

    public b a(JSONObject jSONObject) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("38b5c01d", new Object[]{this, jSONObject});
        }
        if (this.b) {
            throw new IllegalStateException("template has been initialized !");
        }
        this.b = true;
        Template a2 = g.a(jSONObject);
        String a3 = a(a2);
        if (i.containsKey(a3) && (aVar = i.get(a3)) != null && aVar.f2572a != null) {
            this.c = aVar.f2572a;
            this.f2570a = true;
            return b.a(null);
        }
        this.f2570a = b(a2);
        if (!this.f2570a) {
            return b.a(100000, "name: " + a2.name);
        }
        try {
            c(a2);
            a aVar2 = i.get(a3);
            if (aVar2 == null) {
                aVar2 = new a();
                i.put(a3, aVar2);
            }
            aVar2.f2572a = this.c;
            return b.a(null);
        } catch (Exception e) {
            return b.a(100001, e);
        }
    }

    @Override // com.alibaba.android.ultron.engine.template.a
    public b a(TemplateInfo templateInfo) {
        JSONObject g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("5211e696", new Object[]{this, templateInfo});
        }
        if (templateInfo == null) {
            return null;
        }
        String b = b(templateInfo);
        if (b == null) {
            if (templateInfo.getUrl() != null && (g = g(templateInfo)) != null) {
                return a(g);
            }
            return null;
        }
        JSONObject e = e(templateInfo);
        if (e != null) {
            return a(e);
        }
        JSONObject f = f(templateInfo);
        if (f != null) {
            a(templateInfo, f);
            return a(f);
        }
        JSONObject g2 = g(templateInfo);
        if (g2 != null) {
            a(templateInfo, g2);
            b(templateInfo, g2);
            return a(g2);
        }
        String c = c(templateInfo);
        if (Boolean.TRUE.toString().equals(c)) {
            JSONObject e2 = e(templateInfo);
            if (e2 != null) {
                return a(e2);
            }
            c = "模板拉取成功,memCache为空";
        }
        return b.a(100004, c + ResponseProtocolType.COMMENT + b);
    }

    private String c(TemplateInfo templateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c99aa493", new Object[]{this, templateInfo});
        }
        if (templateInfo == null || templateInfo.getUrl() == null) {
            bga.a.a(this.h, "TemplateManager.fetchOriginalTemplate", ErrorConstants.TEMPLATE_URL_NULL.errorCode(), ErrorConstants.TEMPLATE_URL_NULL.errorMessage());
            return "模板url为空";
        }
        JSONObject d = d(templateInfo);
        if (d == null) {
            bga.a.a(this.h, "TemplateManager.fetchOriginalTemplate", ErrorConstants.TEMPLATE_FETCH_FAILED.errorCode(), ErrorConstants.TEMPLATE_FETCH_FAILED.errorMessage());
            return "url获取模板失败";
        }
        String string = d.getString("templateId");
        String string2 = d.getString("version");
        if (!StringUtils.equals(string, templateInfo.getTemplateId()) || !StringUtils.equals(string2, templateInfo.getVersion())) {
            return "获取模板id,version不匹配";
        }
        a(templateInfo, d);
        b(templateInfo, d);
        return Boolean.TRUE.toString();
    }

    private JSONObject d(TemplateInfo templateInfo) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4fbfea6c", new Object[]{this, templateInfo});
        }
        DegradableNetwork degradableNetwork = new DegradableNetwork(this.g.getApplicationContext());
        RequestImpl requestImpl = new RequestImpl(templateInfo.getUrl());
        int c = c();
        requestImpl.setConnectTimeout(c);
        requestImpl.setReadTimeout(c);
        Response syncSend = degradableNetwork.syncSend(requestImpl, null);
        int statusCode = syncSend.getStatusCode();
        byte[] bytedata = syncSend.getBytedata();
        if (bytedata == null) {
            return null;
        }
        String str = new String(bytedata, Charset.defaultCharset());
        try {
            jSONObject = (JSONObject) JSONObject.parse(str);
        } catch (Exception e) {
            bga.a.a(this.h, "TemplateManager.fetchTemplateByUrl", e);
            jSONObject = null;
        }
        boolean isEmpty = true ^ StringUtils.isEmpty(str);
        if (statusCode == 200 && isEmpty) {
            return jSONObject;
        }
        return null;
    }

    private int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : bpd.d();
    }

    private JSONObject e(TemplateInfo templateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1f801e0b", new Object[]{this, templateInfo});
        }
        a aVar = i.get(b(templateInfo));
        if (aVar != null && aVar.b != null) {
            return aVar.b;
        }
        return null;
    }

    private JSONObject f(TemplateInfo templateInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ef4051aa", new Object[]{this, templateInfo}) : (JSONObject) AVFSCacheManager.getInstance().cacheForModule(this.h).b().b(b(templateInfo));
    }

    public void a(TemplateInfo templateInfo, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e822461", new Object[]{this, templateInfo, jSONObject});
            return;
        }
        a aVar = i.get(b(templateInfo));
        if (aVar == null) {
            aVar = new a();
        }
        aVar.b = jSONObject;
        i.put(b(templateInfo), aVar);
        com.alibaba.android.ultron.vfw.instance.d dVar = this.f;
        if (dVar == null || dVar.y() == null || !this.f.y().q()) {
            return;
        }
        try {
            c(g.a(jSONObject));
        } catch (Exception e) {
            bga.a.a(this.h, "TemplateManager.saveMemCache", e);
        }
    }

    public void b(final TemplateInfo templateInfo, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6c864a2", new Object[]{this, templateInfo, jSONObject});
        } else {
            Coordinator.postTask(new Coordinator.TaggedRunnable("ultron saveFileCache") { // from class: com.alibaba.android.ultron.engine.template.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        com.taobao.alivfssdk.cache.b cacheForModule = AVFSCacheManager.getInstance().cacheForModule(d.this.h);
                        cacheForModule.b().a(d.a(d.this, templateInfo), jSONObject);
                        cacheForModule.b().a(d.this.h + "_template_cache_info", (Object) JSON.toJSONString(templateInfo));
                    } catch (Throwable th) {
                        jpr.a(jpu.a(d.this.h).c("saveFileCacheError").b(th.getMessage()));
                    }
                }
            });
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        com.taobao.alivfssdk.cache.b cacheForModule = AVFSCacheManager.getInstance().cacheForModule(this.h);
        if (cacheForModule == null) {
            return;
        }
        h.b<String> bVar = new h.b<String>() { // from class: com.alibaba.android.ultron.engine.template.d.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.alivfssdk.cache.h.b
            public void a(String str, Object obj) {
                TemplateInfo templateInfo;
                JSONObject b;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
                } else if (obj == null || (templateInfo = (TemplateInfo) JSON.parseObject(obj.toString(), TemplateInfo.class)) == null || (b = d.b(d.this, templateInfo)) == null || b.size() <= 0) {
                } else {
                    d.this.a(templateInfo, b);
                }
            }
        };
        h b = cacheForModule.b();
        b.a(this.h + "_template_cache_info", TemplateInfo.class, bVar);
    }

    private JSONObject g(TemplateInfo templateInfo) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bf008549", new Object[]{this, templateInfo});
        }
        String url = templateInfo.getUrl();
        String str = "ultrontemplate_" + this.h + "/" + templateInfo.getTemplateId() + "/" + templateInfo.getVersion() + "/template.json";
        if (StringUtils.isEmpty(url)) {
            url = str;
        } else if (url.startsWith("file:///android_asset/")) {
            url = url.replace("file:///android_asset/", "");
        }
        String d = bpg.d(this.g, url);
        if (StringUtils.isEmpty(d)) {
            d = bpg.b(this.g, url);
        }
        try {
            jSONObject = JSONObject.parseObject(d);
        } catch (Exception e) {
            bga.a.a(this.h, "TemplateManager.getPresetTemplate", e);
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("version");
        String string2 = jSONObject.getString("templateId");
        if (templateInfo.getTemplateId() == null || templateInfo.getVersion() == null) {
            return jSONObject;
        }
        if (StringUtils.equals(templateInfo.getTemplateId(), string2) && StringUtils.equals(templateInfo.getVersion(), string)) {
            return jSONObject;
        }
        bga.a.a(this.h, "TemplateManager.getPresetTemplate", ErrorConstants.TEMPLATE_KEY_NOT_MATCH.errorCode(), ErrorConstants.TEMPLATE_KEY_NOT_MATCH.errorMessage());
        return null;
    }

    @Override // com.alibaba.android.ultron.engine.template.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.d = null;
        }
    }

    @Override // com.alibaba.android.ultron.engine.template.a
    public b a(a.d dVar) {
        bjs bjsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("e443169a", new Object[]{this, dVar});
        }
        if (dVar == null) {
            return b.a((int) b.ERROR_TEMPLATE_INIT_FAILED, "userData is null");
        }
        bjq bjqVar = this.c;
        if (bjqVar == null) {
            return b.a((int) b.ERROR_TEMPLATE_INIT_FAILED, "OriginalTemplateState is null");
        }
        try {
            if (this.f != null) {
                bjsVar = new bjs(this.g, bjqVar, this.d, this.h, this.f.y(), this.f.l().a());
            } else {
                bjsVar = new bjs(this.g, bjqVar, this.d, this.h);
            }
            bjsVar.a(dVar.b);
            b b = bjsVar.b(dVar.f2547a);
            this.d = bjsVar;
            if (b != null) {
                if (b.f2568a) {
                    return b;
                }
            }
            if (this.d.d()) {
                return b.a();
            }
            try {
                this.e = new bjr();
                return this.e.a(this.d);
            } catch (Exception e) {
                return b.a(100003, e);
            }
        } catch (Exception e2) {
            return b.a(100002, e2);
        }
    }

    @Override // com.alibaba.android.ultron.engine.template.a
    public void a(IDMComponent iDMComponent, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca1a8084", new Object[]{this, iDMComponent, jSONObject});
        } else {
            this.d.a(iDMComponent, jSONObject);
        }
    }

    private boolean b(Template template) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cbef0d29", new Object[]{this, template})).booleanValue() : (template == null || template.hierarchy == null || template.blocks == null) ? false : true;
    }

    private void c(Template template) {
        bjq bjqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5436266", new Object[]{this, template});
            return;
        }
        com.alibaba.android.ultron.vfw.instance.d dVar = this.f;
        if (dVar != null && dVar.y() != null && this.f.y().q() && (bjqVar = this.c) != null && template != bjqVar.c()) {
            return;
        }
        this.c = new bjq(template);
        this.c.b();
    }
}
