package com.taobao.umipublish.extension.windvane.abilities;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.extension.windvane.abilities.ImageStokeAbility;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruw;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "outputPath", "", "base64Info", "invoke", "com/taobao/umipublish/extension/windvane/abilities/ImageStokeAbility$strokeImageAndExport$1$1"}, k = 3, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class ImageStokeAbility$strokeImageAndExport$$inlined$forEach$lambda$1 extends Lambda implements ruw<String, String, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ImageStokeAbility.Image $image;
    public final /* synthetic */ String $marvelJSONPath$inlined;
    public final /* synthetic */ ImageStokeAbility this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageStokeAbility$strokeImageAndExport$$inlined$forEach$lambda$1(ImageStokeAbility.Image image, ImageStokeAbility imageStokeAbility, String str) {
        super(2);
        this.$image = image;
        this.this$0 = imageStokeAbility;
        this.$marvelJSONPath$inlined = str;
    }

    @Override // tb.ruw
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2423invoke(String str, String str2) {
        invoke2(str, str2);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e679ae93", new Object[]{this, str, str2});
            return;
        }
        this.$image.a(str);
        this.$image.b(str2);
        ImageStokeAbility.c(this.this$0);
    }
}
