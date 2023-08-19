class Comment(val userId: Int, val message: String)

val comments: List<Comment> = listOf(
    Comment(5241, "Nice Code"),
    Comment(6624, "Like it"),
    Comment(5224, "What's going on?"),
    Comment(9001, "Check out my Website"),
    Comment(8818, "Hello everyone, :)")
)

val blockedUserIds: Set<Int> = setOf(5224, 9001)

val userIdToRelation: Map<Int, String> = mapOf(5241 to "Friend", 6624 to "Work Collegue")

fun main() {
    for(comment in comments) {
        if(comment.userId !in blockedUserIds) {
        
            val relation = userIdToRelation[comment.userId] ?: "unknown"
            
            println("comment ${comment.message} from ${relation}")
        }
    }
}