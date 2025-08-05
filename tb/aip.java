package tb;

import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.airbnb.lottie.network.a;
import com.airbnb.lottie.network.c;
import com.taobao.tao.Globals;
import java.io.IOException;

/* loaded from: classes2.dex */
public class aip implements c {
    @Override // com.airbnb.lottie.network.c
    public a a(String str) throws IOException {
        return new aio(new DegradableNetwork(Globals.getApplication()).getConnection(new RequestImpl(str), null));
    }
}
