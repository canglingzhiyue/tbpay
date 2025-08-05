package tb;

import com.taobao.weex.common.Constants;
import io.unicorn.embedding.engine.FlutterJNI;
import io.unicorn.plugin.common.a;
import io.unicorn.plugin.common.c;
import io.unicorn.view.AccessibilityBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class rtk {

    /* renamed from: a  reason: collision with root package name */
    public final io.unicorn.plugin.common.a<Object> f33366a;
    public final FlutterJNI b;
    final a.c<Object> c = new b(this);
    private a d;

    /* loaded from: classes9.dex */
    public interface a extends FlutterJNI.a {
        void a(int i);

        void a(String str);

        void b(int i);

        void b(String str);

        void c(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public static class b implements a.c<Object> {

        /* renamed from: a  reason: collision with root package name */
        private final rtk f33367a;

        static {
            kge.a(-1053566537);
            kge.a(1179971269);
        }

        public b(rtk rtkVar) {
            this.f33367a = rtkVar;
        }

        public static void a() {
        }

        @Override // io.unicorn.plugin.common.a.c
        public void a(Object obj, a.d<Object> dVar) {
            if (this.f33367a.d == null) {
                dVar.a(null);
                return;
            }
            JSONObject jSONObject = (JSONObject) obj;
            try {
                String string = jSONObject.getString("type");
                Integer valueOf = Integer.valueOf(jSONObject.getInt(com.taobao.tao.flexbox.layoutmanager.container.b.KEY_NODE_ID));
                String string2 = jSONObject.getString("message");
                rtd.a("AccessibilityChannel", "Received " + string + " message.");
                char c = 65535;
                switch (string.hashCode()) {
                    case -1140076541:
                        if (string.equals("tooltip")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -649620375:
                        if (string.equals("announce")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 114595:
                        if (string.equals(shc.SCENE_TAP)) {
                            c = 1;
                            break;
                        }
                        break;
                    case 97604824:
                        if (string.equals(Constants.Event.FOCUS)) {
                            c = 3;
                            break;
                        }
                        break;
                    case 114203431:
                        if (string.equals("longPress")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                if (c != 0) {
                    if (c != 1) {
                        if (c != 2) {
                            if (c != 3) {
                                if (c == 4 && string2 != null) {
                                    this.f33367a.d.b(string2);
                                }
                            } else if (valueOf != null) {
                                this.f33367a.d.c(valueOf.intValue());
                            }
                        } else if (valueOf != null) {
                            this.f33367a.d.b(valueOf.intValue());
                        }
                    } else if (valueOf != null) {
                        this.f33367a.d.a(valueOf.intValue());
                    }
                } else if (string2 != null) {
                    this.f33367a.d.a(string2);
                }
                dVar.a(null);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    static {
        kge.a(1993151184);
    }

    public rtk(rti rtiVar, FlutterJNI flutterJNI) {
        this.f33366a = new io.unicorn.plugin.common.a<>(rtiVar, "unicorn/accessibility", c.INSTANCE);
        this.f33366a.a(this.c);
        this.b = flutterJNI;
    }

    public static void c() {
        b.a();
    }

    public void a() {
        this.b.setSemanticsEnabled(true);
    }

    public void a(int i) {
        this.b.setAccessibilityFeatures(i);
    }

    public void a(int i, AccessibilityBridge.Action action) {
        this.b.dispatchSemanticsAction(i, action);
    }

    public void a(int i, AccessibilityBridge.Action action, Object obj) {
        this.b.dispatchSemanticsAction(i, action, obj);
    }

    public void a(a aVar) {
        this.d = aVar;
        this.b.setAccessibilityDelegate(aVar);
    }

    public void b() {
        this.b.setSemanticsEnabled(false);
    }
}
