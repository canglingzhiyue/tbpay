package tb;

import com.alibaba.marvel.App;
import com.alibaba.marvel.Exporter;
import com.alibaba.marvel.MeEditor;
import com.alibaba.marvel.Project;
import com.alibaba.marvel.Viewer;
import com.alibaba.marvel.exporter.ImageExporter;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.s;
import com.taobao.android.litecreator.util.u;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes5.dex */
public class hem implements hel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<Project> b = new ArrayList();
    private List<MeEditor> c = new ArrayList();
    private List<Viewer> d = new ArrayList();
    private List<Exporter> e = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    private final App f28574a = new App();

    static {
        kge.a(1342499202);
        kge.a(1208815901);
    }

    @Override // tb.hel
    public synchronized Project a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Project) ipChange.ipc$dispatch("5a9d3493", new Object[]{this});
        }
        Project project = new Project(this.f28574a);
        this.b.add(project);
        u.d("MarvelPool", "project size = " + this.b.size());
        return project;
    }

    @Override // tb.hel
    public synchronized MeEditor b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MeEditor) ipChange.ipc$dispatch("bbe1c586", new Object[]{this});
        }
        if (this.c.isEmpty()) {
            this.c.add(new MeEditor(this.f28574a));
        }
        u.d("MarvelPool", "editor size = " + this.c.size());
        return this.c.remove(this.c.size() - 1);
    }

    @Override // tb.hel
    public synchronized Viewer c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Viewer) ipChange.ipc$dispatch("a493367a", new Object[]{this});
        }
        if (this.d.isEmpty()) {
            this.d.add(new Viewer(this.f28574a));
        }
        u.d("MarvelPool", "view size = " + this.d.size());
        return this.d.remove(this.d.size() - 1);
    }

    @Override // tb.hel
    public synchronized void a(MeEditor meEditor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83bf53c5", new Object[]{this, meEditor});
            return;
        }
        if (!this.c.contains(meEditor)) {
            this.c.add(meEditor);
        }
    }

    @Override // tb.hel
    public synchronized void a(Viewer viewer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0969038", new Object[]{this, viewer});
            return;
        }
        if (!this.d.contains(viewer)) {
            this.d.add(viewer);
        }
    }

    @Override // tb.hel
    public synchronized ImageExporter e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageExporter) ipChange.ipc$dispatch("ba6c8b20", new Object[]{this});
        }
        Exporter imageExporter = new ImageExporter();
        this.e.add(imageExporter);
        return imageExporter;
    }

    @Override // tb.hel
    public synchronized void a(ImageExporter imageExporter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8af01d5c", new Object[]{this, imageExporter});
            return;
        }
        if (s.E()) {
            imageExporter.destroy();
            this.e.remove(imageExporter);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        u.a(RPCDataItems.SWITCH_TAG_LOG, "aYou thumbnailL focus onDestroy, marvelPool, mEditorPoolList.s=" + this.c.size() + " ，mViewerPoolList.s=" + this.d.size() + " ,mProjectPoolList.s=" + this.b.size());
        for (MeEditor meEditor : this.c) {
            meEditor.getCoreEditor().destroy();
        }
        for (Viewer viewer : this.d) {
            viewer.destroy();
        }
        if (s.E()) {
            ListIterator<Exporter> listIterator = this.e.listIterator();
            while (listIterator.hasNext()) {
                listIterator.next().destroy();
            }
        }
        for (Project project : this.b) {
            project.destroy();
        }
        this.f28574a.destroy();
    }
}
