package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.bp;
import com.taobao.android.abilityidl.ability.bq;
import com.taobao.android.abilityidl.ability.br;
import com.taobao.android.abilityidl.ability.bs;
import com.taobao.android.abilityidl.ability.bt;
import com.taobao.android.abilityidl.ability.bu;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.kge;

/* loaded from: classes4.dex */
public final class FileAbilityWrapper extends AbsAbilityWrapper<AbsFileAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1568630625);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileAbilityWrapper(AbsFileAbility impl) {
        super(impl);
        kotlin.jvm.internal.q.d(impl, "impl");
    }

    @Override // com.alibaba.ability.b
    public ExecuteResult execute(String api, als context, Map<String, ? extends Object> params, aln callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, api, context, params, callback});
        }
        kotlin.jvm.internal.q.d(api, "api");
        kotlin.jvm.internal.q.d(context, "context");
        kotlin.jvm.internal.q.d(params, "params");
        kotlin.jvm.internal.q.d(callback, "callback");
        switch (api.hashCode()) {
            case -2139808842:
                if (!api.equals(com.alibaba.alibity.container.file.a.API_APPEND_FILE)) {
                    return null;
                }
                try {
                    getAbilityImpl().appendFile(context, new av(params), new k(callback));
                    return null;
                } catch (Throwable th) {
                    return a$a.Companion.b(th.getMessage());
                }
            case -1588426075:
                if (!api.equals(com.alibaba.alibity.container.file.a.API_GET_DIR_INFO)) {
                    return null;
                }
                try {
                    getAbilityImpl().getDirInfo(context, new an(params), new e(callback));
                    return null;
                } catch (Throwable th2) {
                    return a$a.Companion.b(th2.getMessage());
                }
            case -1406748165:
                if (!api.equals(com.alibaba.alibity.container.file.a.API_WRITE_FILE)) {
                    return null;
                }
                try {
                    getAbilityImpl().writeFile(context, new av(params), new j(callback));
                    return null;
                } catch (Throwable th3) {
                    return a$a.Companion.b(th3.getMessage());
                }
            case -1289358244:
                if (!api.equals(com.alibaba.alibity.container.file.a.API_EXISTS)) {
                    return null;
                }
                try {
                    getAbilityImpl().exists(context, new an(params), new a(callback));
                    return null;
                } catch (Throwable th4) {
                    return a$a.Companion.b(th4.getMessage());
                }
            case -934594754:
                if (!api.equals(com.alibaba.alibity.container.file.a.API_RENAME)) {
                    return null;
                }
                try {
                    getAbilityImpl().rename(context, new at(params), new c(callback));
                    return null;
                } catch (Throwable th5) {
                    return a$a.Companion.b(th5.getMessage());
                }
            case -506374511:
                if (!api.equals(com.alibaba.alibity.container.file.a.API_COPY_FILE)) {
                    return null;
                }
                try {
                    getAbilityImpl().copyFile(context, new ao(params), new i(callback));
                    return null;
                } catch (Throwable th6) {
                    return a$a.Companion.b(th6.getMessage());
                }
            case 111449576:
                if (!api.equals(com.alibaba.alibity.container.file.a.API_UNZIP)) {
                    return null;
                }
                try {
                    getAbilityImpl().unzip(context, new au(params), new d(callback));
                    return null;
                } catch (Throwable th7) {
                    return a$a.Companion.b(th7.getMessage());
                }
            case 832575423:
                if (!api.equals(com.alibaba.alibity.container.file.a.API_MAKE_DIR)) {
                    return null;
                }
                try {
                    getAbilityImpl().makeDir(context, new aq(params), new f(callback));
                    return null;
                } catch (Throwable th8) {
                    return a$a.Companion.b(th8.getMessage());
                }
            case 1098154016:
                if (!api.equals(com.alibaba.alibity.container.file.a.API_REMOVE_FILE)) {
                    return null;
                }
                try {
                    getAbilityImpl().removeFile(context, new an(params), new l(callback));
                    return null;
                } catch (Throwable th9) {
                    return a$a.Companion.b(th9.getMessage());
                }
            case 1282348393:
                if (!api.equals(com.alibaba.alibity.container.file.a.API_REMOVE_DIR)) {
                    return null;
                }
                try {
                    getAbilityImpl().removeDir(context, new as(params), new g(callback));
                    return null;
                } catch (Throwable th10) {
                    return a$a.Companion.b(th10.getMessage());
                }
            case 1342041536:
                if (!api.equals(com.alibaba.alibity.container.file.a.API_GET_FILE_INFO)) {
                    return null;
                }
                try {
                    getAbilityImpl().getFileInfo(context, new ap(params), new b(callback));
                    return null;
                } catch (Throwable th11) {
                    return a$a.Companion.b(th11.getMessage());
                }
            case 1572385433:
                if (!api.equals(com.alibaba.alibity.container.file.a.API_READ_AS_STRING)) {
                    return null;
                }
                try {
                    getAbilityImpl().readAsString(context, new ar(params), new h(callback));
                    return null;
                } catch (Throwable th12) {
                    return a$a.Companion.b(th12.getMessage());
                }
            default:
                return null;
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements bp {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8665a;

        public a(aln alnVar) {
            this.f8665a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.bp
        public void a(FileCommonResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fbac8d59", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8665a.a(new FinishResult((JSONObject) json, "onData"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            bp.a.a(this, result);
            this.f8665a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements bq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8669a;

        public e(aln alnVar) {
            this.f8669a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.bq
        public void a(FileDirInfoResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1288fa97", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8669a.a(new FinishResult((JSONObject) json, "onData"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            bq.a.a(this, result);
            this.f8669a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements bp {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8670a;

        public f(aln alnVar) {
            this.f8670a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.bp
        public void a(FileCommonResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fbac8d59", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8670a.a(new FinishResult((JSONObject) json, "onData"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            bp.a.a(this, result);
            this.f8670a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements bp {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8671a;

        public g(aln alnVar) {
            this.f8671a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.bp
        public void a(FileCommonResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fbac8d59", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8671a.a(new FinishResult((JSONObject) json, "onData"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            bp.a.a(this, result);
            this.f8671a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements bs {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8672a;

        public h(aln alnVar) {
            this.f8672a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.bs
        public void a(FileReadAsStringResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4e1529ab", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8672a.a(new FinishResult((JSONObject) json, "onData"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            bs.a.a(this, result);
            this.f8672a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class i implements bp {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8673a;

        public i(aln alnVar) {
            this.f8673a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.bp
        public void a(FileCommonResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fbac8d59", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8673a.a(new FinishResult((JSONObject) json, "onData"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            bp.a.a(this, result);
            this.f8673a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class j implements bp {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8674a;

        public j(aln alnVar) {
            this.f8674a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.bp
        public void a(FileCommonResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fbac8d59", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8674a.a(new FinishResult((JSONObject) json, "onData"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            bp.a.a(this, result);
            this.f8674a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class k implements bp {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8675a;

        public k(aln alnVar) {
            this.f8675a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.bp
        public void a(FileCommonResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fbac8d59", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8675a.a(new FinishResult((JSONObject) json, "onData"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            bp.a.a(this, result);
            this.f8675a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class l implements bp {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8676a;

        public l(aln alnVar) {
            this.f8676a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.bp
        public void a(FileCommonResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fbac8d59", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8676a.a(new FinishResult((JSONObject) json, "onData"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            bp.a.a(this, result);
            this.f8676a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements br {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8666a;

        public b(aln alnVar) {
            this.f8666a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.br
        public void a(FileInfoResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5c836", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8666a.a(new FinishResult((JSONObject) json, "onData"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            br.a.a(this, result);
            this.f8666a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements bt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8667a;

        public c(aln alnVar) {
            this.f8667a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.bt
        public void a(FileRenameFileResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("103bfdca", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8667a.a(new FinishResult((JSONObject) json, "onData"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            bt.a.a(this, result);
            this.f8667a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements bu {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8668a;

        public d(aln alnVar) {
            this.f8668a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.bu
        public void a(FileUnzipResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d6c8fea", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8668a.a(new FinishResult((JSONObject) json, "onData"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            bu.a.a(this, result);
            this.f8668a.a(result);
        }
    }
}
