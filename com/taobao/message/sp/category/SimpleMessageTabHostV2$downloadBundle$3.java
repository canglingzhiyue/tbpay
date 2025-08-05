package com.taobao.message.sp.category;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.chat.component.chatinput.view.KeyBoardPanelSwitch;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.inner2.Container;
import com.taobao.message.sp.category.transformer.UpdateDownloadProgressTransformer;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "progress", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class SimpleMessageTabHostV2$downloadBundle$3 extends Lambda implements rul<Integer, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ SimpleMessageTabHostV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleMessageTabHostV2$downloadBundle$3(SimpleMessageTabHostV2 simpleMessageTabHostV2) {
        super(1);
        this.this$0 = simpleMessageTabHostV2;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.t, java.lang.Object] */
    @Override // tb.rul
    /* renamed from: invoke */
    public /* synthetic */ t mo2421invoke(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c9923577", new Object[]{this, num});
        }
        invoke(num.intValue());
        return t.INSTANCE;
    }

    public final void invoke(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b945e4", new Object[]{this, new Integer(i)});
        } else if (KeyBoardPanelSwitch.isFastDoubleClick(500)) {
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("progress", Integer.valueOf(i));
            linkedHashMap.put("complete", false);
            Event build = new Event.Build(UpdateDownloadProgressTransformer.NAME).data(linkedHashMap).build();
            SimpleMessageTabHostV2 simpleMessageTabHostV2 = this.this$0;
            Container container = SimpleMessageTabHostV2.$ipChange;
            if (container == null) {
                return;
            }
            container.postEvent(build);
        }
    }
}
