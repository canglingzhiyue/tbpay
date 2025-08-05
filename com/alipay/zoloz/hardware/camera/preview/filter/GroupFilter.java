package com.alipay.zoloz.hardware.camera.preview.filter;

import android.content.res.Resources;
import android.opengl.GLES20;
import com.alipay.zoloz.hardware.camera.preview.utils.MatrixUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.network.AccsConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes3.dex */
public class GroupFilter extends AFilter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Queue<AFilter> l;
    private List<AFilter> m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int[] r;
    private int[] s;
    private int[] t;
    private int u;

    public static /* synthetic */ Object ipc$super(GroupFilter groupFilter, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alipay.zoloz.hardware.camera.preview.filter.AFilter
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    @Override // com.alipay.zoloz.hardware.camera.preview.filter.AFilter
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    public GroupFilter(Resources resources) {
        super(resources);
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 2;
        this.r = new int[1];
        this.s = new int[1];
        this.t = new int[this.q];
        this.u = 0;
        this.m = new ArrayList();
        this.l = new ConcurrentLinkedQueue();
    }

    public void addFilter(AFilter aFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9100e991", new Object[]{this, aFilter});
            return;
        }
        MatrixUtils.flip(aFilter.getMatrix(), false, true);
        this.l.add(aFilter);
    }

    public boolean removeFilter(AFilter aFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d1d2d2", new Object[]{this, aFilter})).booleanValue();
        }
        boolean remove = this.m.remove(aFilter);
        if (remove) {
            this.p--;
        }
        return remove;
    }

    public AFilter removeFilter(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AFilter) ipChange.ipc$dispatch("41dabe41", new Object[]{this, new Integer(i)});
        }
        AFilter remove = this.m.remove(i);
        if (remove != null) {
            this.p--;
        }
        return remove;
    }

    public void clearAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c823e69b", new Object[]{this});
            return;
        }
        this.l.clear();
        this.m.clear();
        this.p = 0;
    }

    @Override // com.alipay.zoloz.hardware.camera.preview.filter.AFilter
    public void draw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cea46fcb", new Object[]{this});
            return;
        }
        g();
        this.u = 0;
        if (this.p <= 0) {
            return;
        }
        for (AFilter aFilter : this.m) {
            GLES20.glBindFramebuffer(36160, this.r[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.t[this.u % 2], 0);
            GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.s[0]);
            GLES20.glViewport(0, 0, this.n, this.o);
            int i = this.u;
            if (i == 0) {
                aFilter.setTextureId(getTextureId());
            } else {
                aFilter.setTextureId(this.t[(i - 1) % 2]);
            }
            aFilter.draw();
            j();
            this.u++;
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        while (true) {
            AFilter poll = this.l.poll();
            if (poll == null) {
                return;
            }
            poll.create();
            poll.setSize(this.n, this.o);
            this.m.add(poll);
            this.p++;
        }
    }

    @Override // com.alipay.zoloz.hardware.camera.preview.filter.AFilter
    public int getOutputTexture() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2ee26f9e", new Object[]{this})).intValue() : this.p == 0 ? getTextureId() : this.t[(this.u - 1) % 2];
    }

    @Override // com.alipay.zoloz.hardware.camera.preview.filter.AFilter
    public void onSizeChanged(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb57503b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.n = i;
        this.o = i2;
        g();
        h();
    }

    private boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        GLES20.glGenFramebuffers(1, this.r, 0);
        GLES20.glGenRenderbuffers(1, this.s, 0);
        i();
        GLES20.glBindFramebuffer(36160, this.r[0]);
        GLES20.glBindRenderbuffer(36161, this.s[0]);
        GLES20.glRenderbufferStorage(36161, 33189, this.n, this.o);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.t[0], 0);
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.s[0]);
        j();
        return false;
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        GLES20.glGenTextures(this.q, this.t, 0);
        for (int i = 0; i < this.q; i++) {
            GLES20.glBindTexture(3553, this.t[i]);
            GLES20.glTexImage2D(3553, 0, 6408, this.n, this.o, 0, 6408, 5121, null);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLES20.glTexParameteri(3553, AccsConnection.DATA_PACKAGE_MAX, 9729);
            GLES20.glTexParameteri(3553, 10241, 9729);
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        GLES20.glBindRenderbuffer(36161, 0);
        GLES20.glBindFramebuffer(36160, 0);
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        GLES20.glDeleteRenderbuffers(1, this.s, 0);
        GLES20.glDeleteFramebuffers(1, this.r, 0);
        GLES20.glDeleteTextures(1, this.t, 0);
    }

    @Override // com.alipay.zoloz.hardware.camera.preview.filter.AFilter
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        if (this.p > 0) {
            for (AFilter aFilter : this.m) {
                aFilter.release();
            }
        }
        k();
        clearAll();
    }
}
