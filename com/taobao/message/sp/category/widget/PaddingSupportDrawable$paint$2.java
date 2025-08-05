package com.taobao.message.sp.category.widget;

import android.graphics.Paint;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Paint;", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class PaddingSupportDrawable$paint$2 extends Lambda implements ruk<Paint> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ PaddingSupportDrawable this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaddingSupportDrawable$paint$2(PaddingSupportDrawable paddingSupportDrawable) {
        super(0);
        this.this$0 = paddingSupportDrawable;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final Paint mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Paint) ipChange.ipc$dispatch("c42f78c", new Object[]{this});
        }
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.this$0.getBgColor());
        return paint;
    }
}
