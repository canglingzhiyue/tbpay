package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.bf;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import java.util.Map;
import kotlin.Metadata;
import tb.gay;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/taobao/android/dinamicx/widget/AliDXNewRichTextImageImpl;", "Lcom/taobao/android/dinamicx/AliDXRichTextImageImpl;", "Lcom/taobao/android/dinamicx/widget/IDXNewRichTextImageInterface;", "()V", "downloadImage", "", "context", "Landroid/content/Context;", "url", "", "option", "Lcom/taobao/android/dinamicx/widget/IDXNewRichTextImageInterface$RichTextImageOption;", "callback", "Lcom/taobao/android/dinamicx/widget/richtext/DXImageSpanWidgetNode$ImageLoadCallback;", "TBDinamicX_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes5.dex */
public final class at extends com.taobao.android.dinamicx.c implements bf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.dinamicx.widget.bf
    public void a(Context context, String str, bf.a aVar, gay.b bVar) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a73137f1", new Object[]{this, context, str, aVar, bVar});
        } else if (!TextUtils.isEmpty(str) && bVar != null) {
            PhenixCreator succListener = com.taobao.phenix.intf.b.h().a(str).succListener(new a(bVar));
            if (aVar != null && (map = aVar.f12079a) != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    succListener.addLoaderExtra(entry.getKey(), entry.getValue());
                }
            }
            succListener.fetch();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "event", "Lcom/taobao/phenix/intf/event/SuccPhenixEvent;", "kotlin.jvm.PlatformType", "onHappen"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes5.dex */
    public static final class a<T extends com.taobao.phenix.intf.event.d> implements com.taobao.phenix.intf.event.a<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ gay.b f12065a;

        public a(gay.b bVar) {
            this.f12065a = bVar;
        }

        @Override // com.taobao.phenix.intf.event.a
        public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
        }

        public final boolean a(SuccPhenixEvent event) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3b4dd374", new Object[]{this, event})).booleanValue();
            }
            gay.b bVar = this.f12065a;
            kotlin.jvm.internal.q.b(event, "event");
            BitmapDrawable drawable = event.getDrawable();
            kotlin.jvm.internal.q.b(drawable, "event.drawable");
            bVar.a(drawable.getBitmap());
            return false;
        }
    }
}
