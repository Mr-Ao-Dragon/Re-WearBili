package cn.spacexc.wearbili.remake.app.main.recommend.domain.remote.rcmd.app

data class Extra(
    val act_img: String,
    val ad_content_type: Int,
    val appstore_priority: Int,
    val appstore_url: String,
    val bg_img: String,
    val card: Card,
    val click_area: Int,
    val click_urls: List<Any>,
    val download_whitelist: List<Any>,
    val enable_double_jump: Boolean,
    val enable_h5_alert: Boolean,
    val enable_h5_pre_load: Int,
    val enable_share: Boolean,
    val enable_store_direct_launch: Int,
    val feedback_panel_style: Int,
    val from_track_id: String,
    val h5_pre_load_url: String,
    val hot_activity_id: Long,
    val landingpage_download_style: Int,
    val layout: String,
    val macro_replace_priority: Int,
    val open_whitelist: List<Any>,
    val preload_landingpage: Int,
    val product_id: Long,
    val report_time: Int,
    val sales_type: Int,
    val shop_id: Long,
    val show_1s_urls: List<Any>,
    val show_urls: List<Any>,
    val special_industry: Boolean,
    val special_industry_style: Int,
    val special_industry_tips: String,
    val store_callup_card: Boolean,
    val track_id: String,
    val up_mid: Long,
    val upzone_entrance_report_id: Long,
    val upzone_entrance_type: Int,
    val use_ad_web_v2: Boolean
)