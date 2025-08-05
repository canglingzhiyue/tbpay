package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai.business.project.Project;
import com.taobao.taopai.business.project.b;
import com.taobao.taopai.stage.j;

/* loaded from: classes5.dex */
public class iop {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private j f29192a;
    private Project b;

    static {
        kge.a(1227271438);
    }

    public iop(j jVar, Project project) {
        a(jVar, project);
    }

    public void a(j jVar, Project project) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b6ca29b", new Object[]{this, jVar, project});
            return;
        }
        this.f29192a = jVar;
        this.b = project;
    }

    public void a(boolean z) {
        Project project;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        j jVar = this.f29192a;
        if (jVar == null || (project = this.b) == null) {
            return;
        }
        b.a(jVar, project, z);
    }
}
