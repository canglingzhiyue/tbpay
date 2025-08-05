package com.taobao.android.searchbaseframe.datasource.impl;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.a;
import com.taobao.android.searchbaseframe.datasource.c;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.result.SearchResult;
import com.taobao.android.searchbaseframe.net.ResultError;
import com.taobao.android.searchbaseframe.net.ResultException;
import com.taobao.android.searchbaseframe.net.e;
import com.taobao.android.searchbaseframe.net.f;
import com.taobao.android.searchbaseframe.track.d;
import com.taobao.android.searchbaseframe.util.r;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.virtual_thread.face.h;
import java.io.BufferedReader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.imn;
import tb.ioy;
import tb.isk;
import tb.itt;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class b<RESULT extends BaseSearchResult> extends isk<RESULT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final ExecutorService d;
    private String c;

    public abstract itt.a a(Map<String, String> map, a.C0571a c0571a);

    public void a(RESULT result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee5bf110", new Object[]{this, result});
        }
    }

    @Override // tb.isk
    public com.taobao.android.searchbaseframe.net.a b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.searchbaseframe.net.a) ipChange.ipc$dispatch("ce8485e8", new Object[]{this, map});
        }
        return null;
    }

    public void b(RESULT result, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f17b92a1", new Object[]{this, result, jSONObject});
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.isk
    public /* bridge */ /* synthetic */ void a(e eVar, SearchResult searchResult, c.a aVar) {
        a(eVar, (e) ((BaseSearchResult) searchResult), aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.isk
    public /* bridge */ /* synthetic */ void a(e eVar, SearchResult searchResult, com.taobao.android.searchbaseframe.net.c cVar, c.a aVar, boolean z, Runnable runnable, d dVar) {
        a(eVar, (e) ((BaseSearchResult) searchResult), cVar, aVar, z, runnable, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.isk
    public /* bridge */ /* synthetic */ void a(e eVar, SearchResult searchResult, f fVar, c.a aVar) {
        a(eVar, (e) ((BaseSearchResult) searchResult), fVar, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.isk
    public /* bridge */ /* synthetic */ void a(Object obj, SearchResult searchResult) {
        a(obj, (Object) ((BaseSearchResult) searchResult));
    }

    @Override // tb.isk
    public /* synthetic */ com.taobao.android.searchbaseframe.net.d b(Map map, com.taobao.android.searchbaseframe.net.d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.searchbaseframe.net.d) ipChange.ipc$dispatch("d649d07a", new Object[]{this, map, dVar}) : a(map, dVar);
    }

    @Override // tb.isk
    public /* synthetic */ com.taobao.android.searchbaseframe.net.d c(Map map, a.C0571a c0571a) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.searchbaseframe.net.d) ipChange.ipc$dispatch("da2d6cbd", new Object[]{this, map, c0571a}) : b(map, c0571a);
    }

    static {
        kge.a(-422480666);
        ExecutorService newFixedThreadPool = VExecutors.newFixedThreadPool(5, new h() { // from class: com.taobao.android.searchbaseframe.datasource.impl.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.virtual_thread.face.h
            public String newThreadName() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this}) : "xsearch_template_download";
            }
        });
        d = newFixedThreadPool;
        if (newFixedThreadPool instanceof ThreadPoolExecutor) {
            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) d;
            threadPoolExecutor.setKeepAliveTime(3L, TimeUnit.SECONDS);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
    }

    public b(imn imnVar, ioy ioyVar) {
        super(imnVar, ioyVar);
    }

    @Override // tb.isk
    public boolean a(com.taobao.android.searchbaseframe.net.d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("828ba797", new Object[]{this, dVar})).booleanValue() : !TextUtils.isEmpty(b(((itt.a) ((itt) dVar).b).c));
    }

    public com.taobao.android.searchbaseframe.net.a a(Map<String, String> map, com.taobao.android.searchbaseframe.net.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.searchbaseframe.net.a) ipChange.ipc$dispatch("92e360dc", new Object[]{this, map, dVar});
        }
        itt ittVar = (itt) dVar;
        String str = ((itt.a) ittVar.b).c;
        new HashMap((Map) ittVar.c).putAll(map);
        return new com.taobao.android.searchbaseframe.net.a(r.a(b(str), map));
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        String a2 = com.taobao.android.searchbaseframe.ace.b.a(a(), str);
        return TextUtils.isEmpty(a2) ? a().k().a(str) : a2;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [OPTIONS, tb.itt$b] */
    /* JADX WARN: Type inference failed for: r6v1, types: [API, tb.itt$a] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.HashMap, PARAMS] */
    public itt b(Map<String, String> map, a.C0571a c0571a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (itt) ipChange.ipc$dispatch("7c1159da", new Object[]{this, map, c0571a});
        }
        itt ittVar = new itt();
        ittVar.b = a(map, c0571a);
        a().k().a(map, ((itt.a) ittVar.b).c);
        com.taobao.android.searchbaseframe.ace.b.a(a(), map, ((itt.a) ittVar.b).c);
        ittVar.c = new HashMap();
        ((Map) ittVar.c).putAll(map);
        ittVar.d = new itt.b();
        ((itt.b) ittVar.d).f29315a = true;
        ((itt.b) ittVar.d).b = false;
        return ittVar;
    }

    public void a(e eVar, RESULT result, f fVar, c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67cf6c6e", new Object[]{this, eVar, result, fVar, aVar});
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new StringReader(new String(eVar.a(), kotlin.text.d.UTF_8.name())));
            String[] split = bufferedReader.readLine().split(":");
            String readLine = bufferedReader.readLine();
            String substring = readLine.substring(readLine.indexOf(":"));
            if (TextUtils.equals(split[1], "data")) {
                a((b<RESULT>) result, JSON.parseObject(substring));
                a((b<RESULT>) result);
            } else if (TextUtils.equals(split[1], "complete")) {
                result.setSseFinished(true);
            } else if (!TextUtils.equals(split[1], "error")) {
            } else {
                result.setSseFinished(true);
                result.setResultError(new ResultError(6, substring));
            }
        } catch (Exception unused) {
            result.setResultError(new ResultError(6, "流式数据 parse 出错"));
        }
    }

    public void a(e eVar, final RESULT result, com.taobao.android.searchbaseframe.net.c cVar, c.a aVar, boolean z, Runnable runnable, final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b10c9a04", new Object[]{this, eVar, result, cVar, aVar, new Boolean(z), runnable, dVar});
            return;
        }
        HashMap hashMap = new HashMap();
        if (this.b != null) {
            this.b.a(eVar, hashMap);
        }
        try {
            final JSONObject a2 = cVar.a(e.a(eVar));
            try {
                if (this.f29279a.a().c()) {
                    result._setDebugRawResult(a2);
                }
                if (z) {
                    b((b<RESULT>) result, a2);
                    Future<?> submit = d.submit(new Runnable() { // from class: com.taobao.android.searchbaseframe.datasource.impl.b.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            b.this.a((b) result, a2);
                            dVar.x = System.currentTimeMillis();
                        }
                    });
                    runnable.run();
                    submit.get();
                } else {
                    a((b<RESULT>) result, a2);
                    dVar.x = System.currentTimeMillis();
                }
                if (a().a().c()) {
                    try {
                        b((b<RESULT>) result);
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e) {
                a().b().b("BaseSearchResultAdapter", "error parse", e);
                result.setResultError(new ResultError(3, e));
                if (this.b != null) {
                    hashMap.put("errCode", String.valueOf(3));
                    hashMap.put("errMsg", e.getMessage());
                    this.b.i(hashMap);
                }
            }
            a((b<RESULT>) result);
            if (aVar == null) {
                return;
            }
            try {
                if (!result.isSuccess()) {
                    return;
                }
                a2.toJSONString();
            } catch (Exception unused2) {
                a().b().b("BaseSearchResultAdapter", "transformApiResult setCache Failed!");
            }
        } catch (ResultException e2) {
            result.setResultError(e2.getError());
            if (this.b == null) {
                return;
            }
            ResultError error = e2.getError();
            hashMap.put("errCode", String.valueOf(error.getErrorCode()));
            hashMap.put("errMsg", error.toString());
            this.b.i(hashMap);
        }
    }

    public void a(Object obj, RESULT result) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fbd74b4", new Object[]{this, obj, result});
            return;
        }
        try {
            if (obj instanceof JSONObject) {
                parseObject = (JSONObject) obj;
            } else if (obj instanceof String) {
                parseObject = JSON.parseObject((String) obj);
            } else {
                throw new IllegalArgumentException("preload must be String or JSONObject(fastjson)");
            }
            try {
                if (this.f29279a.a().c()) {
                    result._setDebugRawResult(parseObject);
                }
                a((b<RESULT>) result, parseObject);
                if (a().a().c()) {
                    try {
                        b((b<RESULT>) result);
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e) {
                a().b().b("BaseSearchResultAdapter", "error parse", e);
                result.setResultError(new ResultError(3, e));
            }
            a((b<RESULT>) result);
        } catch (JSONException e2) {
            result.setResultError(new ResultError(7, e2));
        }
    }

    public void a(RESULT result, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b150abe0", new Object[]{this, result, jSONObject});
            return;
        }
        String string = jSONObject.getString("parser");
        if (TextUtils.isEmpty(string)) {
            string = this.c;
        }
        a().p().a(string).a(result, jSONObject, this.f29279a);
    }

    public void b(RESULT result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ccea2f", new Object[]{this, result});
        } else {
            a().b().c("BaseSearchResultAdapter", "Result Summary:\n %s", result);
        }
    }

    public void a(e eVar, RESULT result, c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f7fe977", new Object[]{this, eVar, result, aVar});
            return;
        }
        try {
            JSONObject a2 = e.a(eVar);
            try {
                if (this.f29279a.a().c()) {
                    result._setDebugRawResult(a2);
                }
                a((b<RESULT>) result, a2);
                if (a().a().c()) {
                    try {
                        b((b<RESULT>) result);
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e) {
                a().b().b("BaseSearchResultAdapter", "error parse", e);
                result.setResultError(new ResultError(3, e));
            }
            a((b<RESULT>) result);
            if (aVar == null) {
                return;
            }
            try {
                if (!result.isSuccess()) {
                    return;
                }
                a2.toJSONString();
            } catch (Exception unused2) {
                a().b().b("BaseSearchResultAdapter", "transformApiResult setCache Failed!");
            }
        } catch (ResultException e2) {
            result.setResultError(e2.getError());
        }
    }
}
