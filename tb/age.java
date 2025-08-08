package tb;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import cn.wh.auth.server.a;
import com.alibaba.security.realidentity.i2;
import com.alipay.mobile.common.logging.api.LogContext;

/* loaded from: classes2.dex */
public abstract class age {

    /* renamed from: a  reason: collision with root package name */
    public agd f25317a;
    public Activity b;
    public agj c;

    public age(Activity activity, agj agjVar) {
        this.b = activity;
        this.c = agjVar;
    }

    public void a(agd agdVar) {
        String str;
        this.f25317a = agdVar;
        final agi agiVar = new agi();
        if (StringUtils.isEmpty(this.c.b())) {
            agiVar.b("应用ID异常");
            str = i2.l;
        } else if (!StringUtils.isEmpty(this.c.a())) {
            if (!agh.a(this.b)) {
                agiVar.b("APP尚未安装");
                agiVar.a(i2.c);
            } else {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName("cn.cyberIdentity.certification", "cn.wh.project.view.v.authorization.WAuthActivity"));
                intent.setFlags(8388608);
                intent.putExtra("orgID", this.c.a());
                intent.putExtra(LogContext.STORAGE_APPID, this.c.b());
                intent.putExtra("bizSeq", this.c.c());
                intent.putExtra("type", this.c.d() + "");
                intent.putExtra("packageName", this.b.getApplication().getPackageName());
                try {
                    new a(this.b).a(intent, new a.InterfaceC0030a() { // from class: tb.age.1
                        @Override // cn.wh.auth.server.a.InterfaceC0030a
                        public void a(int i, int i2, Intent intent2) {
                            agi agiVar2;
                            String str2;
                            if (i2 != -1 || i != 111) {
                                agiVar.a(i2.j);
                                agiVar2 = agiVar;
                                str2 = "数据处理异常";
                            } else if (intent2 != null) {
                                agiVar.a(intent2.getStringExtra("resultCode"));
                                agiVar.b(intent2.getStringExtra("resultDesc"));
                                agiVar.a().a(intent2.getStringExtra("idCardAuthData"));
                                agiVar.a().b(intent2.getStringExtra("certPwdData"));
                                agiVar.a().c(intent2.getStringExtra("verifyData"));
                                age.this.f25317a.onResult(agiVar);
                            } else {
                                agiVar.a(i2.d);
                                agiVar2 = agiVar;
                                str2 = "用户已取消";
                            }
                            agiVar2.b(str2);
                            age.this.f25317a.onResult(agiVar);
                        }
                    });
                    return;
                } catch (Exception unused) {
                    agiVar.b("APP尚未安装");
                    agiVar.a(i2.c);
                    agdVar = this.f25317a;
                }
            }
            agdVar.onResult(agiVar);
        } else {
            agiVar.b("机构ID异常");
            str = i2.k;
        }
        agiVar.a(str);
        agdVar.onResult(agiVar);
    }
}
