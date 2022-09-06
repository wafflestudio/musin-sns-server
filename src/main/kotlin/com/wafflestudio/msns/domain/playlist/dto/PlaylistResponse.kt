package com.wafflestudio.msns.domain.playlist.dto

import com.wafflestudio.msns.domain.playlist.model.Playlist
import com.wafflestudio.msns.domain.track.dto.TrackResponse
import java.util.UUID

class PlaylistResponse {
    data class PreviewResponse(
        val id: Long,
        val streamId: UUID,
        val thumbnail: String
    ) {
        constructor(playlist: Playlist) : this(
            id = playlist.id,
            streamId = playlist.streamId,
            thumbnail = playlist.thumbnail
        )
    }

    data class PreviewDto(
        val id: UUID,
        val thumbnail: String
    )

    data class DetailResponse(
        val id: UUID,
        val title: String,
        val tracks: List<TrackResponse.APIDto>,
        val preview: PreviewDto
    )
}
