package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class gbw implements gha {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, gfx> f28300a = new HashMap(150);

    static {
        kge.a(562093629);
        kge.a(-292780614);
        b(new gca());
        b(new gcb());
        b(new gcc());
        b(new gcd());
        b(new gce());
        b(new gcf());
        b(new gcg());
        b(new gcj());
        b(new gcn());
        b(new gck());
        b(new gcl());
        b(new gcm());
        b(new gcn());
        b(new gco());
        b(new gch());
        b(new gcp());
        b(new gci());
        b(new fsw());
        b(new fsh());
        b(new gef());
        b(new geg());
        b(new geh());
        b(new gej());
        b(new gek());
        b(new gel());
        b(new gem());
        b(new gen());
        b(new gep());
        b(new geq());
        b(new ged());
        b(new gee());
        b(new gei());
        b(new geo());
        b(new gdi());
        b(new gdj());
        b(new gdl());
        b(new gdm());
        b(new gdk());
        b(new gex());
        b(new gcw());
        b(new gcv());
        b(new gda());
        b(new gdb());
        b(new gdc());
        b(new gdd());
        b(new gde());
        b(new gdg());
        b(new gdh());
        b(new gdf());
        b(new gdn());
        b(new gdo());
        b(new gdp());
        b(new gdq());
        b(new gds());
        b(new gdr());
        b(new gdt());
        b(new gdu());
        b(new gdv());
        b(new gdw());
        b(new gdy());
        b(new gdz());
        b(new gea());
        b(new geb());
        b(new gec());
        b(new gdx());
        b(new ger());
        b(new ges());
        b(new get());
        b(new geu());
        b(new gew());
        b(new gey());
        b(new gev());
        b(new gcx());
        b(new gcz());
        b(new gcy());
        b(new gcu());
        b(new gcs());
        b(new gcr());
        b(new gct());
        b(new gcq());
        b(new ftu());
        b(new ftv());
        b(new fre());
        b(new fsm());
        b(new frw());
        b(new fuq());
        b(new fsz());
        b(new frx());
        b(new fsy());
        b(new frl());
        b(new fui());
        b(new fti());
        b(new fus());
        b(new fso());
        b(new jwz());
        b(new kpa());
        b(new koq());
        b(new fsg());
        b(new ftt());
        b(new frn());
    }

    public void a(ghe gheVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea408cb4", new Object[]{this, gheVar});
        } else {
            this.f28300a.put(gheVar.getDxFunctionName(), gfx.a(gheVar));
        }
    }

    private static void b(ghe gheVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8c39335", new Object[]{gheVar});
        } else {
            BUILD_IN_FUNC_MAP.put(gheVar.getDxFunctionName(), gfx.a(gheVar));
        }
    }

    @Override // tb.gha
    public gfx a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("7c6fadbb", new Object[]{this, str});
        }
        gfx gfxVar = BUILD_IN_FUNC_MAP.get(str);
        return gfxVar != null ? gfxVar : this.f28300a.get(str);
    }
}
