package tb;

import java.util.LinkedList;
import java.util.List;
import tv.danmaku.ijk.media.player.AbstractMediaPlayer;

/* loaded from: classes8.dex */
public class ozn {

    /* renamed from: a  reason: collision with root package name */
    public final String f32509a;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public AbstractMediaPlayer f;
    public AbstractMediaPlayer g;
    public List<a> h;
    public float i;
    public int j;
    public boolean k;
    public String l;

    /* loaded from: classes8.dex */
    public interface a {
        int getCurrentPosition();

        int getDestoryState();

        boolean isPlaying();

        boolean isVisible();

        void release(boolean z);
    }

    static {
        kge.a(-863934083);
    }

    public ozn(String str) {
        this.i = -1.0f;
        this.j = -1;
        this.k = true;
        this.f32509a = str;
    }

    public ozn(String str, a aVar) {
        this.i = -1.0f;
        this.j = -1;
        this.k = true;
        this.h = new LinkedList();
        this.h.add(aVar);
        this.f32509a = str;
    }

    private ozn() {
        this.i = -1.0f;
        this.j = -1;
        this.k = true;
        this.f32509a = null;
    }
}
