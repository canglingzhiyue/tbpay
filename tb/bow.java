package tb;

import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.alibaba.android.aura.service.event.AURAEventKey;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.event.base.f;
import com.alibaba.android.ultron.vfw.instance.UltronInstanceConfig;
import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.android.ultron.vfw.viewholder.h;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.model.b;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class bow {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-951775567);
    }

    public static void a(UltronInstanceConfig.ExposureStrategy exposureStrategy, bny bnyVar, f fVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91b8e24c", new Object[]{exposureStrategy, bnyVar, fVar, dVar});
        } else {
            bnyVar.a(new a(exposureStrategy, fVar, dVar));
        }
    }

    /* loaded from: classes2.dex */
    public static class a implements boe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final UltronInstanceConfig.ExposureStrategy f26028a;
        private final d b;
        private final f c;

        static {
            kge.a(-433031297);
            kge.a(-76523735);
        }

        @Override // tb.boe
        public void a(ViewGroup viewGroup, int i, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fdad4c9", new Object[]{this, viewGroup, new Integer(i), map});
            }
        }

        public a(UltronInstanceConfig.ExposureStrategy exposureStrategy, f fVar, d dVar) {
            this.f26028a = exposureStrategy;
            this.c = fVar;
            this.b = dVar;
        }

        @Override // tb.boe
        public void a(h hVar, IDMComponent iDMComponent, Map<String, Object> map) {
            Map<String, List<b>> eventMap;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa110afe", new Object[]{this, hVar, iDMComponent, map});
            } else if (iDMComponent != null && (eventMap = iDMComponent.getEventMap()) != null) {
                a(this.b, iDMComponent);
                List<b> list = eventMap.get(AURAEventKey.exposureItem);
                if (list == null) {
                    return;
                }
                for (int i = 0; i < list.size(); i++) {
                    b bVar = list.get(i);
                    if (bVar != null) {
                        String type = bVar.getType();
                        if (!TextUtils.isEmpty(type)) {
                            if ("userTrack".equals(type)) {
                                JSONObject fields = iDMComponent.getFields();
                                if (fields != null && fields.containsKey("asyncStatus") && !"success".equals(fields.getString("asyncStatus"))) {
                                    String b = this.c.b();
                                    UnifyLog.a(b, "ItemExposureStrategy", "component asyncStatus is not success " + iDMComponent.getKey(), new String[0]);
                                } else if (this.f26028a == UltronInstanceConfig.ExposureStrategy.EXPOSURE_ONCE && iDMComponent.getExtMap() != null) {
                                    if (iDMComponent.getExtMap().get("exposureCount") == null) {
                                        iDMComponent.getExtMap().put("exposureCount", 1);
                                    }
                                }
                            }
                            e a2 = this.c.a().a(type);
                            a2.a(iDMComponent);
                            if (map != null) {
                                a2.a((Map<? extends String, ? extends Object>) map);
                            }
                            a2.e(AURAEventKey.exposureItem);
                            a2.a(bVar);
                            String b2 = this.c.b();
                            UnifyLog.a(b2, "ItemExposureStrategy", "component exposure item:" + type + ", " + iDMComponent.getKey(), new String[0]);
                            this.c.a(a2);
                        }
                    }
                }
            }
        }

        private void a(d dVar, IDMComponent iDMComponent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2d10e7", new Object[]{this, dVar, iDMComponent});
            } else if (dVar == null || iDMComponent == null || !"init".equals(bph.a(iDMComponent, "asyncStatus", ""))) {
            } else {
                ArrayMap<String, Object> extMap = iDMComponent.getExtMap();
                if (!(extMap != null && extMap.get("lazyLoadStatus") == null)) {
                    return;
                }
                dVar.b(iDMComponent);
                iDMComponent.getExtMap().put("lazyLoadStatus", 1);
                String b = this.c.b();
                UnifyLog.a(b, "ItemExposureStrategy", "lazy component exposure so load " + iDMComponent.getKey(), new String[0]);
            }
        }
    }
}
