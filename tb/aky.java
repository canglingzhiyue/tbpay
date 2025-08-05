package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class aky {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f25414a;
    public float d;
    public float b = 0.0f;
    public float c = Float.MAX_VALUE;
    public int e = -1;
    private float[] f = {1.9f, 1.8f, 1.7f, 1.5f, 1.4f, 1.2f, 1.0f, 0.9f, 0.8f};
    private float[] g = {2.4f, 2.2f, 2.0f, 1.8f, 1.5f, 1.3f, 1.2f, 1.0f, 0.9f};

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private void b() {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.aky.b():void");
    }

    @Deprecated
    public void a() {
        float[] fArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        b();
        if (this.f25414a >= 8) {
            fArr = this.f;
        } else {
            fArr = this.g;
        }
        int i = 0;
        while (true) {
            if (i >= fArr.length) {
                i = 9;
                break;
            } else if (this.b >= fArr[i]) {
                break;
            } else {
                i++;
            }
        }
        int i2 = 10;
        int i3 = 10 - i;
        int i4 = this.f25414a;
        if (i4 < 16) {
            i2 = i4 >= 8 ? 9 : i4 >= 6 ? 8 : i4 >= 4 ? 6 : i4 >= 2 ? 4 : 0;
        }
        this.e = (int) ((i3 * 0.6f) + (i2 * 0.4f));
    }
}
