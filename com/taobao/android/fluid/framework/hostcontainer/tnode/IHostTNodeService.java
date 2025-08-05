package com.taobao.android.fluid.framework.hostcontainer.tnode;

import com.taobao.android.fluid.core.FluidService;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.event.b;
import java.util.Map;
import tb.snd;

/* loaded from: classes5.dex */
public interface IHostTNodeService extends FluidService, snd {
    void createSharedTNodeEngine();

    ab getSharedTNodeEngine();

    aa getTNode();

    void reLayoutForVirtualNavigationBar();

    void sendMessage(String str, String str2, Map map, b bVar);
}
