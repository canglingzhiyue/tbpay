package com.taobao.tao.flexbox.layoutmanager.container.dx;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.container.dx.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;
import tb.rul;
import tb.rva;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class DxContainer$createView$2 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ a.b $customParams;
    public final /* synthetic */ rul $downloadCallBak;
    public final /* synthetic */ int $height;
    public final /* synthetic */ String $name;
    public final /* synthetic */ rva $renderCallback;
    public final /* synthetic */ String $url;
    public final /* synthetic */ long $version;
    public final /* synthetic */ int $width;
    public final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DxContainer$createView$2(a aVar, int i, int i2, String str, long j, String str2, a.b bVar, rul rulVar, rva rvaVar) {
        super(0);
        this.this$0 = aVar;
        this.$height = i;
        this.$width = i2;
        this.$name = str;
        this.$version = j;
        this.$url = str2;
        this.$customParams = bVar;
        this.$downloadCallBak = rulVar;
        this.$renderCallback = rvaVar;
    }

    @Override // tb.ruk
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2427invoke() {
        mo2427invoke();
        return t.INSTANCE;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            this.this$0.a(this.$height, this.$width, this.$name, this.$version, this.$url, this.$customParams, this.$downloadCallBak, this.$renderCallback);
        }
    }
}
