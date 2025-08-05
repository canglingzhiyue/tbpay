package tb;

import android.content.Context;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import com.alibaba.ability.b;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nj\u0002`\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J4\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\b2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nj\u0002`\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u0011"}, d2 = {"Lcom/taobao/alibity/container/navigationbar/NavigationBarAbility;", "Lcom/alibaba/ability/IAbility;", "()V", e.RECORD_EXECUTE, "Lcom/alibaba/ability/result/ExecuteResult;", "api", "", "context", "Lcom/alibaba/ability/env/IAbilityContext;", "params", "", "", "Lcom/alibaba/ability/AbilityData;", "callback", "Lcom/alibaba/ability/callback/AbilityCallback;", "setTitle", "abilityContext", "megability-kit-container-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes4.dex */
public final class ddr implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alibaba.ability.b
    public ExecuteResult execute(String api, als context, Map<String, ? extends Object> params, aln callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, api, context, params, callback});
        }
        q.d(api, "api");
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        if (api.hashCode() == 1405084438 && api.equals("setTitle")) {
            return a(context, params, callback);
        }
        a$a.a aVar = a$a.Companion;
        return aVar.a("api " + api + " not found");
    }

    private final ExecuteResult a(als alsVar, Map<String, ? extends Object> map, aln alnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("e3d9aefd", new Object[]{this, alsVar, map, alnVar});
        }
        Context f = alsVar.f().f();
        if (!(f instanceof AppCompatActivity)) {
            return new ErrorResult("500", "env.getContext is invalid.", (Map) null, 4, (o) null);
        }
        Object obj = map.get("title");
        if (!(obj instanceof String)) {
            a$a.a aVar = a$a.Companion;
            return aVar.b("Invalid param title=" + obj + '.');
        }
        ActionBar supportActionBar = ((AppCompatActivity) f).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.a((CharSequence) obj);
            return new FinishResult(null, null, 3, null);
        }
        return new ErrorResult("500", "no action to be set.", (Map) null, 4, (o) null);
    }
}
