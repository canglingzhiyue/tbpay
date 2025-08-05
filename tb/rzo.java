package tb;

import java.util.List;
import java.util.Map;
import mtopsdk.mtop.common.MtopEvent;
import mtopsdk.ssrcore.b;

/* loaded from: classes9.dex */
public class rzo {

    /* renamed from: a  reason: collision with root package name */
    public MtopEvent f33436a;
    public b b;
    public mtk c;
    public mtj d;
    public int e;
    public Map<String, List<String>> f;
    public byte[] g;

    public rzo(MtopEvent mtopEvent, b bVar) {
        this.f33436a = mtopEvent;
        this.b = bVar;
    }

    public rzo(b bVar, mtj mtjVar, int i, Map<String, List<String>> map) {
        this.b = bVar;
        this.d = mtjVar;
        this.e = i;
        this.f = map;
    }

    public rzo(b bVar, mtj mtjVar, byte[] bArr) {
        this.b = bVar;
        this.d = mtjVar;
        this.g = bArr;
    }
}
