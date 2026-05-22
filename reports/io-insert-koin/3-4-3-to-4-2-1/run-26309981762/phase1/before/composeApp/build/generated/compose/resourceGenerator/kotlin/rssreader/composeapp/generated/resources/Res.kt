package rssreader.composeapp.generated.resources

import kotlin.ByteArray
import kotlin.OptIn
import kotlin.String
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.ResourceItem
import org.jetbrains.compose.resources.StringResource
import org.jetbrains.compose.resources.readResourceBytes

@OptIn(org.jetbrains.compose.resources.InternalResourceApi::class)
@ExperimentalResourceApi
internal object Res {
  /**
   * Reads the content of the resource file at the specified path and returns it as a byte array.
   *
   * Example: `val bytes = Res.readBytes("files/key.bin")`
   *
   * @param path The path of the file to read in the compose resource's directory.
   * @return The content of the file as a byte array.
   */
  public suspend fun readBytes(path: String): ByteArray = readResourceBytes(path)

  public object drawable {
    public val ic_add: DrawableResource = DrawableResource(
          "drawable:ic_add",
          setOf(
            ResourceItem(
              setOf(),
              "drawable/ic_add.xml"
            ),
          )
        )

    public val ic_arrow_back: DrawableResource = DrawableResource(
          "drawable:ic_arrow_back",
          setOf(
            ResourceItem(
              setOf(),
              "drawable/ic_arrow_back.xml"
            ),
          )
        )

    public val ic_edit: DrawableResource = DrawableResource(
          "drawable:ic_edit",
          setOf(
            ResourceItem(
              setOf(),
              "drawable/ic_edit.xml"
            ),
          )
        )

    public val ic_home: DrawableResource = DrawableResource(
          "drawable:ic_home",
          setOf(
            ResourceItem(
              setOf(),
              "drawable/ic_home.xml"
            ),
          )
        )

    public val ic_refresh: DrawableResource = DrawableResource(
          "drawable:ic_refresh",
          setOf(
            ResourceItem(
              setOf(),
              "drawable/ic_refresh.xml"
            ),
          )
        )
  }

  public object string {
    public val add: StringResource = StringResource(
          "string:add",
          "add",
          setOf(
            ResourceItem(
              setOf(),
              "values/strings.xml"
            ),
          )
        )

    public val all: StringResource = StringResource(
          "string:all",
          "all",
          setOf(
            ResourceItem(
              setOf(),
              "values/strings.xml"
            ),
          )
        )

    public val app_name: StringResource = StringResource(
          "string:app_name",
          "app_name",
          setOf(
            ResourceItem(
              setOf(),
              "values/strings.xml"
            ),
          )
        )

    public val remove: StringResource = StringResource(
          "string:remove",
          "remove",
          setOf(
            ResourceItem(
              setOf(),
              "values/strings.xml"
            ),
          )
        )

    public val rss_feed_url: StringResource = StringResource(
          "string:rss_feed_url",
          "rss_feed_url",
          setOf(
            ResourceItem(
              setOf(),
              "values/strings.xml"
            ),
          )
        )
  }
}
